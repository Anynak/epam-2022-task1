package com.company.comparators;

import com.company.toys.Toy;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
