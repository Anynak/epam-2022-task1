package com.company;
import com.company.comparators.PriceComparator;
import com.company.comparators.SizeComparator;
import com.company.room.Room;
import com.company.room.RoomHandler;


public class Main {

    public static void main(String[] args) {

        RoomHandler roomHandler = new RoomHandler(new Room(5000));
        roomHandler.fillRandomToys();
        System.out.println(roomHandler.getRoom());
        roomHandler.getRoom().sort(new PriceComparator());
        System.out.println("\n");
        System.out.println(roomHandler.getRoom());

    }
}
