package com.company.TimJavaDevelopersCourseExercisesTeenNumberChekcer;

public class TeenChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9,20,100));

    }

    public static boolean hasTeen(int a, int b, int c){

        if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19){
            return true;
        }

        return false;
    }
}
