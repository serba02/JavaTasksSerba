package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lev_Serba on 9/13/2016.
 */
public class TestArithmetics {
    @Test
    public void testAdd() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.add(3.0, 7.0);
        if(res != 10.0) {
            Assert.fail();
        }
    }

    @Test
    public void testDeduct() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.deduct(3.0, 1.0);
        if(res != 2.0) {
            Assert.fail();
        }
    }

    @Test
    public void testMult() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.mult(8.0, 2.0);
        if(res != 16.0) {
            Assert.fail();
        }
    }

    @Test
    public void testDiv() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.div(4.0, 2.0);
        if(res != 2.0) {
            Assert.fail();
        }
    }

}