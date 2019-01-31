package com.company;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScore("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Lucy", highScorePosition);

        highScorePosition = calculateHighScorePosition(88);
        displayHighScore("Andy", highScorePosition);

    }

    public static void displayHighScore(String name, int position) {
        System.out.println(name + " got position number: " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000){
            return 1;
        }else if(score >= 500) {
            return 2;
        }else if(score > 100){
            return 3;
        }else{
            return 4;
        }
    }
}
