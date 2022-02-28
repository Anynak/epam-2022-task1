package com.company.room;

import com.company.Filters.RangeFilter;
import com.company.NotEnoughMoneyException;
import com.company.toy.Toy;

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

    public void addToy(Toy toy) throws NotEnoughMoneyException {
        if (toy != null) {
            if (toy.getPrice() <= getFreeMoney()) {
                toys.add(toy);
                freeMoney -= toy.getPrice();
            } else {
                throw new NotEnoughMoneyException(freeMoney + " money Available. Toy price is " + toy.getPrice());
            }
        }

    }

    public void sort(Comparator<Toy> comparator) {
        getToys().sort(comparator);
    }

    public ArrayList<Toy> findToys(RangeFilter rangeFilter) {
        ArrayList<Toy> foundToys = new ArrayList<>();
        for (Toy toy : toys) {
            if (rangeFilter.check(toy)) {
                foundToys.add(toy);
            }
        }
        return foundToys;
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
