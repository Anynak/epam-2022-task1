package com.company;
import com.company.comparators.PriceComparator;
import com.company.room.Room;
import com.company.room.RoomHandler;
import com.company.toys.Toy;
import com.company.toys.ToyAgeGroup;
import com.company.toys.ToySize;
import com.company.toys.ToyType;


public class Main {

    public static void main(String[] args) {

        RoomHandler roomHandler = new RoomHandler(new Room(5000));
        roomHandler.fillRandomToys();
        System.out.println(roomHandler.getRoom());
        try {
            roomHandler.getRoom().addToy(new Toy(ToyType.DOLL, ToySize.BIG, ToyAgeGroup.AGE_GROUP_1));
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        roomHandler.getRoom().sort(new PriceComparator());
        System.out.println("\n");
        System.out.println(roomHandler.getRoom());

    }
}
