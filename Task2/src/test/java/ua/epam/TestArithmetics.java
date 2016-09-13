package ua.epam;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Lev_Serba on 9/13/2016.
 */
public class TestArithmetics {
    private static Arithmetics a;
    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @BeforeClass
    public static void runT(){
        a = new Arithmetics();
    }
    @Test
    public void testAdd() throws Exception {
        double res = a.add(3.0, 7.0);
        Assert.assertEquals(res, 10.0, 0);
    }

    @Test
    public void testDeduct() throws Exception {
        double res = a.deduct(3.0, 1.0);
        Assert.assertEquals(res, 2.0, 0);
    }

    @Test
    public void testMult() throws Exception {
        double res = a.mult(8.0, 2.0);
        Assert.assertEquals(res, 16.0, 0);
    }

    @Test
    public void testDiv() throws Exception {
        double res = a.div(4.0, 2.0);
        Assert.assertEquals(res, 2.0, 0);
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testDivException(){
        exp.expect(ArithmeticException.class);
        a.div(2.0, 0.0);
    }

    @Test(timeout = 1000)
    public void testN(){
        a.div(10.0, 2.0);
    }
}