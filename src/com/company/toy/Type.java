package com.company.toy;

public enum Type {
    CAR {
        public double getBasePrice() {
            return 150;
        }
    },
    DOLL {
        public double getBasePrice() {
            return 550;
        }
    },
    CUBE {
        public double getBasePrice() {
            return 50;
        }
    },
    BALL {
        public double getBasePrice() {
            return 250;
        }
    };

    public abstract double getBasePrice();


}
