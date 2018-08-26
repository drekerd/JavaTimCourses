package com.company.timJavaDevelopersCourseExerciseLeapCalculator;

public class YearCalculator {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2017));

    }

    public static boolean isLeapYear(int year){

        if(year >= 1 && year <=9999){
            if(year%4 == 0 && year%100!=0 || year%400==0){

                return true;
            }
        }
        return false;

    }
}
