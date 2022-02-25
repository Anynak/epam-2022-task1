package com.company.toys;

public enum ToySize {
    SMALL{
        public double getMargin(){return 1;}
        public String getDescription() {return "small";}
        public int getValue() {return 1;}
    },
    MEDIUM{
        public double getMargin(){return 1.5;}
        public String getDescription() {return "medium";}
        public int getValue() {return 2;}
    },
    BIG{
        public double getMargin(){return 2;}
        public String getDescription() {return "big";}
        public int getValue() {return 3;}
    };

    public abstract String getDescription();
    public abstract int getValue();
    public abstract double getMargin();

}
