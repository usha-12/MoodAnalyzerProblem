package com.brideglabz.exception;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String analyseMood() {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
        }
        return "Happy";
    }

}