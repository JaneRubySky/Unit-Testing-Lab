package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by janerubygrissom on 7/13/16.
 */

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class SnakeTest {

    Snake snake = new Snake(true);
    String expectedResult, actualResult;
    int expectedR, actualR;

    @Test
    public void snakeHisses() throws Exception {
        expectedResult = "Hiss!!!";
        actualResult = snake.makeNoise();
        assertTrue(expectedResult.equals(actualResult));

        assertEquals("Snake does not make the right sound!", expectedResult, actualResult);
    }

    @Test
    public void checkTopSpeed() throws Exception {
        expectedR = 5;
        actualR = snake.getTopSpeed();
        assertTrue(expectedR == actualR);

        assertEquals("Snake does not have the right speed!", expectedResult, actualResult);
    }

}
