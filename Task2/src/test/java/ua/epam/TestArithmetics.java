package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lev_Serba on 9/13/2016.
 */
public class TestArithmetics {
    Arithmetics a;
    public void runT(){
        a = new Arithmetics();
    }
    @Test
    public void testAdd() throws Exception {
        runT();
        double res = a.add(3.0, 7.0);
        Assert.assertEquals(res, 10.0, 0);
        a = null;
    }

    @Test
    public void testDeduct() throws Exception {
        runT();
        double res = a.deduct(3.0, 1.0);
        Assert.assertEquals(res, 2.0, 0);
        a = null;
    }

    @Test
    public void testMult() throws Exception {
        runT();
        double res = a.mult(8.0, 2.0);
        Assert.assertEquals(res, 16.0, 0);
        a = null;
    }

    @Test
    public void testDiv() throws Exception {
        runT();
        double res = a.div(4.0, 2.0);
        Assert.assertEquals(res, 2.0, 0);
        a = null;
    }

}