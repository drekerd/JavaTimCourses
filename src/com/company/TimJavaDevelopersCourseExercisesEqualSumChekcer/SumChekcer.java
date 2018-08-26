package com.company.TimJavaDevelopersCourseExercisesEqualSumChekcer;

public class SumChekcer {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,3));

    }

    public static boolean hasEqualSum(int a, int b, int c){

        a = a+b;

        if(a==c){
            return true;
        }
        return false;

    }

}


