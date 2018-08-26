package com.company.TimJavaDevelopserCoursesMethodOverLoading;

public class Overload {

    public static void main(String[] args) {

        System.out.println(calculateScore("Mário",100));

    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player "+playerName+" scored " + score + " points");
        return score*1000;
    }
}
