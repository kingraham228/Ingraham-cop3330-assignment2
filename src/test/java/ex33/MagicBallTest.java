package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {

    @Test
    @DisplayName("Test random generator for errors and even distribution")
    void giveAnswer_testGenerator() {
        MagicBall test = new MagicBall();
        int testCount;
        int yesCount = 0;
        int noCount = 0;
        int maybeCount = 0;
        int laterCount = 0;
        int errorCount = 0;
        for (testCount = 0; testCount<1000; testCount++){
            String answTest = test.giveAnswer();
            if(answTest.equals("Yes.")){
                yesCount++;
            }else{
                if(answTest.equals("No.")){
                    noCount++;
                } else{
                    if(answTest.equals("Maybe.")){
                        maybeCount++;
                    } else{
                        if(answTest.equals("Ask again later.")){
                            laterCount++;
                        }else{
                            errorCount++;
                        }
                    }
                }
            }
        }

        System.out.println("Yes count: "+yesCount);
        System.out.println("No count: "+noCount);
        System.out.println("Maybe count: "+maybeCount);
        System.out.println("Ask later: "+laterCount);

        assertEquals(0, errorCount);

    }
}