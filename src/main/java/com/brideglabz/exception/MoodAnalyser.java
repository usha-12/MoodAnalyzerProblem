package com.brideglabz.exception;
public class MoodAnalyser {
    public static String message;

    public void setMessage(String message) {

        this.message = message;
    }
    public  MoodAnalyser() {
        this.message = null;

    }

    public String analyseMood() throws MoodAnalyserException {
        try {

            if (this.message.contains(null))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            if (message==null)
                throw new MoodAnalyserException("Please Enter Valid Mood , Don't enter NUll",MoodAnalyserException.Exception_Type.NULL);
            else
                throw new MoodAnalyserException("Please Enter Valid Mood ,Don' keep Empty",MoodAnalyserException.Exception_Type.EMPTY);

            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Happy";

        }
    }
}