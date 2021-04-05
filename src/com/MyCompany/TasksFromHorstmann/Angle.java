package com.BestCompany;

public class Angle {
    public Angle() {
    }
     public int angleNomalization(int degree) {
        degree %= 360;
        if(degree >= 0) {
            return degree;
        }
        else {
            return degree + 360;
        }
     }

    public int angleNomalizationFlorMod(int degree) {
            return Math.floorMod(degree, 360);
    }

}
