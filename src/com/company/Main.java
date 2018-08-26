package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        Player mario = new Player();
        Player joao = new Player();
        Player rui = new Player();

//        System.out.println("Your Final score is " + calculateScore(gameOver,score,levelCompleted,bonus));
        mario.setName("Mário");
        mario.setPosition(1);
        mario.setScore(calculateScore(gameOver,score,levelCompleted,bonus));
        scoreTable(mario.getName(),mario.getPosition());
        mario.setHighScore(highScore(mario.getScore()));

        System.out.println("======================================");
        System.out.println();

        score = 100;
        levelCompleted = 8;
        bonus = 100;
        /*System.out.println("Your final score is " + calculateScore(gameOver,score,levelCompleted,bonus));*/
        joao.setName("Joao");
        joao.setPosition(2);
        joao.setScore(calculateScore(gameOver,score,levelCompleted,bonus));
        scoreTable(joao.getName(),joao.getPosition());
        joao.setHighScore(highScore(joao.getScore()));

        System.out.println("======================================");
        System.out.println();

        score = 10;
        levelCompleted = 8;
        bonus = 2;
        rui.setName("rui");
        rui.setPosition(3);
        rui.setScore(calculateScore(gameOver,score,levelCompleted,bonus));
        scoreTable(rui.getName(),rui.getPosition());
        rui.setHighScore(highScore(rui.getScore()));


        System.out.println(mario.getName()+" highest score position is "+ mario.getHighScore());
        System.out.println(joao.getName()+" highest score position is "+ joao.getHighScore());
        System.out.println(rui.getName()+" highest score position is "+ rui.getHighScore());
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 10;
           // System.out.println("You final score is "+finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void scoreTable(String name, int posittion){
        System.out.println("Player "+ name+ " Managed to get into position "+posittion);
    }

    public static int highScore(int score){

        int position = 4;

        if(score >= 1000){
            position = 1;
        }
        if(score >= 500){
            position = 2;
        }
        if(score >= 100){
            position = 3;
        }
        return position;
    }
}
