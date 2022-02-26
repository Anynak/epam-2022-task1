package com.company.toys;

import java.util.Objects;

public class Toy {

    private final ToyType toyType;
    private final ToySize toySize;
    private final ToyAgeGroup toyAgeGroup;

    public Toy(ToyType toyType, ToySize toySize, ToyAgeGroup toyAgeGroup) {
        this.toyType = toyType;
        this.toySize = toySize;
        this.toyAgeGroup = toyAgeGroup;
    }

    public long getPrice() {
        return (long) (toyType.getBasePrice() * toySize.getMargin());
    }

    public ToyType getToyType() {
        return toyType;
    }

    public ToySize getToySize() {
        return toySize;
    }

    public ToyAgeGroup getToyAgeGroup() {
        return toyAgeGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return toyType == toy.toyType && toySize == toy.toySize && toyAgeGroup == toy.toyAgeGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyType, toySize, toyAgeGroup);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyType=" + toyType +
                ", toySize=" + toySize.getDescription() +
                ", toyAgeGroup=" + toyAgeGroup.getDescription() +
                ", toyPrice=" + getPrice() +
                '}';
    }
}

