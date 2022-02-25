package com.company.toys;

public enum ToyAgeGroup {
    AGE_GROUP_1 {
        public String getDescription() {
            return "from 1 to 3 yo";
        }
        public int getValue() {
            return 1;
        }
    },
    AGE_GROUP_2 {
        public String getDescription() {
            return "from 3 to 5 yo";
        }
        public int getValue() {
            return 2;
        }
    },
    AGE_GROUP_3 {
        public String getDescription() {
            return "from 5 to 7 yo";
        }
        public int getValue() {
            return 3;
        }
    };

    public abstract String getDescription();
    public abstract int getValue();
}
