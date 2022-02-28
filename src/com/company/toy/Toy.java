package com.company.toy;

import java.util.Objects;

public class Toy {

    private final Type type;
    private final Size size;
    private final AgeGroup ageGroup;

    public Toy(Type type, Size size, AgeGroup ageGroup) {
        this.type = type;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    public long getPrice() {
        return (long) (type.getBasePrice() * size.getMargin());
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return type == toy.type && size == toy.size && ageGroup == toy.ageGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, ageGroup);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyType=" + type +
                ", toySize=" + size.getDescription() +
                ", toyAgeGroup=" + ageGroup.getDescription() +
                ", toyPrice=" + getPrice() +
                '}';
    }
}

