package com.company.timJavaDevelopersCourseExerciseDogBark;

public class Dog {

    public static void main(String[] args) {

        System.out.println(bark(true, 22));

    }

    public static boolean bark(boolean barking, int hourOfDay) {



            if (hourOfDay > 22 && hourOfDay < 24 || hourOfDay < 8 && hourOfDay >= 0 && barking) {
                return true;
            }
        return false;
    }
}
