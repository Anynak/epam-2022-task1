package com.company.room;
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

    private boolean addRandomToy() {
        Random random = new Random();
        int toyTypeIndex = random.nextInt(ToyType.values().length);
        int toySizeIndex = random.nextInt(ToySize.values().length);
        int toyAgeGroupIndex = random.nextInt(ToyAgeGroup.values().length);
        Toy randomToy = new Toy(ToyType.values()[toyTypeIndex], ToySize.values()[toySizeIndex], ToyAgeGroup.values()[toyAgeGroupIndex]);
        return room.addToy(randomToy);

    }
    public void fillRandomToys(){
        boolean hasMoney = true;
        while (hasMoney) {
            hasMoney = addRandomToy();
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
