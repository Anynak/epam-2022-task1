package com.company.filters;

import com.company.toy.Toy;
import com.company.toy.AgeGroup;

public class AgeGroupRangeFilter implements RangeFilter {

    private final AgeGroup topValue;
    private final AgeGroup bottomValue;

    public AgeGroupRangeFilter(AgeGroup bottomValue, AgeGroup topValue) {
        this.topValue = topValue;
        this.bottomValue = bottomValue;
    }

    @Override
    public boolean check(Toy toy) {
        return (toy.getAgeGroup().getValue() <= this.topValue.getValue())
                && (toy.getAgeGroup().getValue() >= this.bottomValue.getValue());
    }
}
