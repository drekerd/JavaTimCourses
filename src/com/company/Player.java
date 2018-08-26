package com.company;

public class Player {

    private String name;
    private int score ;
    private int position;
    private int highScore;



    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public int getPosition(){
        return position;
    }
    public int getHighScore(){
        return highScore;
    }


    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public void setHighScore(int highScore){
        this.highScore = highScore;
    }
}
