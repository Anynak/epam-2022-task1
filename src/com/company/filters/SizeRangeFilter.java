package com.company.filters;

import com.company.toy.Toy;
import com.company.toy.Size;

public class SizeRangeFilter implements RangeFilter {

    private final Size topValue;
    private final Size bottomValue;

    public SizeRangeFilter(Size bottomValue, Size topValue) {
        this.topValue = topValue;
        this.bottomValue = bottomValue;
    }

    @Override
    public boolean check(Toy toy) {
        return (toy.getSize().getValue() <= this.topValue.getValue())
                && (toy.getSize().getValue() >= this.bottomValue.getValue());
    }
}
