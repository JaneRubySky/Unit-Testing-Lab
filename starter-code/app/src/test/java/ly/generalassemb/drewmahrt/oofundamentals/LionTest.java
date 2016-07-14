package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by janerubygrissom on 7/13/16.
 */

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LionTest {

    @Test
    public void testIfLionMakesAppropriateSound() throws Exception {
        Lion mLion = new Lion(true);
        String expectedValue = "Roar!!!";
        String actualValue = mLion.makeNoise();

        assertEquals("Lion does not make the right sound!", expectedValue, actualValue);
    }

    @Test
    public void testIfLionHasAppropriateTopSpeed() throws Exception {
        Lion mLion = new Lion(true);
        int expectedValue = 50;
        int actualValue = mLion.getTopSpeed();

        assertEquals("Lion does not have the right speed!", expectedValue, actualValue);

    }

}
