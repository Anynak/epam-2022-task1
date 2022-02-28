package com.company.comparators;

import com.company.toy.Toy;

import java.util.Comparator;

public class AgeGroupComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getAgeGroup().getValue() - o2.getAgeGroup().getValue();
    }
}
