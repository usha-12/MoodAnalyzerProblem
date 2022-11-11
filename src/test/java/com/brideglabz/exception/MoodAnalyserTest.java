package com.brideglabz.exception;
import org.junit.jupiter.api.*;

public class MoodAnalyserTest {
    @BeforeAll
    static void displayMsg() {
        System.out.println("Welcome Mood Analyzer Problem");
    }

    @AfterEach
    public void afterMsgDisplay() {
        System.out.println("Passed");
    }

    @AfterAll
    public static void show_Msg_After_All_Test_Case() {
        System.out.println("All Test Case Completed");
    }

    MoodAnalyser object;

    @BeforeEach
    public void setUp() {
        object = new MoodAnalyser();
    }

    @Test
    public void moodAnalyser() throws MoodAnalyserException {
        String ans = object.analyseMood();
        Assertions.assertEquals("HAPPY", ans);
        System.out.println(ans);
    }
}
/*Inform user if entered
Invalid Mood
- In case of NULL or Empty Mood throw
Custom Exception MoodAnalysisException
- Use Enum to differentiate the Mood
Analysis Errors

TC3.1-Given NULL Mood
Should Throw
MoodAnalysisException

To pass this Test Case in try catch block
throw MoodAnalysisException

TC3.2-Given Empty Mood
Should Throw
MoodAnalysisException
indicating Empty Mood

Handle Empty Mood Scenario throw
MoodAnalysisException and inform
user of the EmptyMood
HINT: Use Enum to EMPTY or NULL*/