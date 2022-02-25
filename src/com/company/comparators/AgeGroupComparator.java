package com.company.comparators;

import com.company.toys.Toy;

import java.util.Comparator;

public class AgeGroupComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getToyAgeGroup().getValue() - o2.getToyAgeGroup().getValue();
    }
}
