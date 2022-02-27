package com.company.room;

import com.company.NotEnoughMoneyException;
import com.company.toys.Toy;
import com.company.toys.ToyAgeGroup;
import com.company.toys.ToySize;
import com.company.toys.ToyType;

import java.util.Objects;
import java.util.Random;

public class RoomHandler {
    private final Room room;

    public RoomHandler(Room room) {
        this.room = room;
    }

    private Toy getRandomToy() {
        Random random = new Random();
        int toyTypeIndex = random.nextInt(ToyType.values().length);
        int toySizeIndex = random.nextInt(ToySize.values().length);
        int toyAgeGroupIndex = random.nextInt(ToyAgeGroup.values().length);
        return new Toy(
                ToyType.values()[toyTypeIndex],
                ToySize.values()[toySizeIndex],
                ToyAgeGroup.values()[toyAgeGroupIndex]
        );
    }

    public void fillRandomToys() {
        Toy randomToy = getRandomToy();
        while (room.getFreeMoney() > randomToy.getPrice()) {
            try {
                room.addToy(randomToy);
                randomToy = getRandomToy();
            } catch (NotEnoughMoneyException e) {
                e.printStackTrace();
            }
        }
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomHandler that = (RoomHandler) o;
        return room.equals(that.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room);
    }
}
