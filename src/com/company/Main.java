package com.company;

import com.company.Filters.SizeRangeFilter;
import com.company.comparators.PriceComparator;
import com.company.room.Room;
import com.company.room.RoomHandler;
import com.company.toy.Size;


public class Main {

    public static void main(String[] args) {

        Room room = new Room(5000);
        RoomHandler roomHandler = new RoomHandler(room);
        roomHandler.fillRandomToys();
        System.out.println(room);
        room.sort(new PriceComparator());
        System.out.println("sorted room:\n");
        System.out.println(room);
        System.out.println("found toys:\n");
        System.out.println(room.findToys(new SizeRangeFilter(Size.SMALL, Size.SMALL)));

    }
}
