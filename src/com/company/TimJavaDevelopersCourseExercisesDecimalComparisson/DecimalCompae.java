package com.company.TimJavaDevelopersCourseExercisesDecimalComparisson;

public class DecimalCompae {

    public static void main(String[] args) {

        double double1 = 3.0;
        double double2 = 3.0;
        System.out.println(areEqualByThreeDecimalPlaces(double1,double2));
    }

    public static boolean areEqualByThreeDecimalPlaces(double double1, double double2){



        int new1 = (int) (double1*1000);
        int new2 = (int) (double2*1000);

        if(new1 == new2){
            return true;
        }
        return false;
    }
}
