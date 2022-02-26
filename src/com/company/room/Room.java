package com.company.room;

import com.company.toys.Toy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Room {
    private long freeMoney;
    private final ArrayList<Toy> toys = new ArrayList<>();

    public Room(long freeMoney) {
        this.freeMoney = freeMoney;
    }

    public long getFreeMoney() {
        return freeMoney;
    }

    public Toy addToy(Toy toy) {
        if (toy != null && toy.getPrice() <= getFreeMoney()) {
            toys.add(toy);
            freeMoney -= toy.getPrice();
        }
        return toy;
    }

    public void sort(Comparator<Toy> comparator) {
        getToys().sort(comparator);
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return freeMoney == room.freeMoney && toys.equals(room.toys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeMoney, toys);
    }

    @Override
    public String toString() {
        StringBuilder toyList = new StringBuilder();
        for (Toy toy : toys) {
            toyList.append(toy).append("\n");
        }
        return toyList.toString();
    }

}
