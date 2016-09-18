package ua.epam.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bredok on 19.09.2016.
 */
public class GameModelTest {

    @Test
    public void testRandom() throws Exception {

        int minRangeValue = 1;
        int maxRangeValue = 99;
        for(int i=0; i<20000; i++){
            Assert.assertTrue((new GameModel().getRandomValue()>=minRangeValue)&&(new GameModel().getRandomValue()<=maxRangeValue));
        }

    }
}