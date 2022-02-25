package com.company.room;
import com.company.toys.Toy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Room {
    long moneyForToys;
    private final ArrayList<Toy> toys = new ArrayList<>();

    public Room(long moneyForToys){
        this.moneyForToys = moneyForToys;
    }

    public long getRemainingMoney() {
        long remainingMoney = moneyForToys;
        for (Toy toy : toys) {
            remainingMoney -= toy.getPrice();
        }
        return remainingMoney;
    }

    public boolean addToy(Toy toy) {
        if (toy != null && toy.getPrice() <= getRemainingMoney()) {
            toys.add(toy);
            return true;
        } else {
            return false;
        }
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
        return moneyForToys == room.moneyForToys && toys.equals(room.toys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moneyForToys, toys);
    }

    @Override
    public String toString() {
        StringBuilder toyList = new StringBuilder();
        for(Toy toy : toys){
            toyList.append(toy).append("\n");
        }
        return toyList.toString();
    }

}
