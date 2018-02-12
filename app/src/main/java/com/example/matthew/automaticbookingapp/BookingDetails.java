package com.example.matthew.automaticbookingapp;

/**
 * Created by Matthew on 12-Feb-18.
 */

public class BookingDetails {

    public static Boolean onOrOff;
    public static String day;
    public static String time;
    public static String player1;
    public static String player2;
    public static String player3;

    //CONSTRUCTOR NEEDED HERE

    public void setOnOrOff(Boolean onOrOff) {
        this.onOrOff = onOrOff;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setPlayer3(String player3) {
        this.player3 = player3;
    }

    public Boolean getOnOrOff() {
        return onOrOff;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getPlayer3() {
        return player3;
    }
    
}
