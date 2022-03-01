package com.company.room;

import com.company.exceptions.NotEnoughMoneyException;
import com.company.toy.Toy;
import com.company.toy.AgeGroup;
import com.company.toy.Size;
import com.company.toy.Type;

import java.util.Objects;
import java.util.Random;

public class RoomHandler {
    private final Room room;

    public RoomHandler(Room room) {
        this.room = room;
    }

    private Toy getRandomToy() {
        Random random = new Random();
        int toyTypeIndex = random.nextInt(Type.values().length);
        int toySizeIndex = random.nextInt(Size.values().length);
        int toyAgeGroupIndex = random.nextInt(AgeGroup.values().length);
        return new Toy(
                Type.values()[toyTypeIndex],
                Size.values()[toySizeIndex],
                AgeGroup.values()[toyAgeGroupIndex]
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
