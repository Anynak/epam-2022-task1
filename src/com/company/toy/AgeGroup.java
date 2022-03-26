package com.company.toy;

public enum AgeGroup {
    AGE_GROUP_1 {
        public int getValue() {
            return 1;
        }

        @Override
        public String toString() {
            return "from 1 to 3 yo";
        }
    },
    AGE_GROUP_2 {
        public int getValue() {
            return 2;
        }

        @Override
        public String toString() {
            return "from 3 to 5 yo";
        }
    },
    AGE_GROUP_3 {
        public int getValue() {
            return 3;
        }

        @Override
        public String toString() {
            return "from 5 to 7 yo";
        }
    };

    public abstract int getValue();
}
