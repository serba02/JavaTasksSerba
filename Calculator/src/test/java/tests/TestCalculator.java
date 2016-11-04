package tests;

import listeners.MethodListener;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Lev_Serba on 10/31/2016.
 */
@Listeners({TestListener.class, MethodListener.class})
public class TestCalculator extends TestBase {

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 1)
    public void testDoubleSumPosTest(double x, double y, double res) throws InterruptedException {
        Assert.assertEquals(calculator.sum(x, y), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 4)
    public void testLongSumPosTest(long x, long y, long res) throws InterruptedException {
        Assert.assertEquals(calculator.sum(x, y), res);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 3)
    public void testDoubleSubPosTest(double x, double y, double res) throws InterruptedException {
        Assert.assertEquals(calculator.sub(x,y), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 2)
    public void testLongSubPosTest(long x, long y, long res) throws InterruptedException {
        Assert.assertEquals(calculator.sub(x, y), res);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 5)
    public void testDoubleMultPosTest(double x, double y, double res) throws InterruptedException {
        Assert.assertEquals(calculator.mult(x,y),res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long" , priority = 2)
    public void testLongMultPosTest(long x, long y, long res) throws InterruptedException {
        Assert.assertEquals(calculator.mult(x, y), res);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 1)
    public void testDoubleDivPosTest(double x, double y, double res) throws InterruptedException {
        Assert.assertEquals(calculator.div(x, y), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "double", expectedExceptions = NumberFormatException.class, priority = 2)
    public void testDoubleDivNegTest(long x, long y) throws InterruptedException {
       calculator.div(x, y);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 2)
    public void testLongDivPosTest(long x, long y, long res) throws InterruptedException {
        Assert.assertEquals(calculator.div(x, y), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long", expectedExceptions = NumberFormatException.class, priority = 2)
    public void testLongDivNegTest(long x, long y) throws InterruptedException {
        calculator.div(x, y);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 1)
    public void testDoublePowPosTest(double x, double y, double res) throws InterruptedException {
        Assert.assertEquals(calculator.pow(x,y), res);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 4)
    public void testDoubleSqrtPosTest(double x, double res) throws InterruptedException {
        Assert.assertEquals(calculator.sqrt(x), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderDouble", groups = "double", expectedExceptions = IllegalArgumentException.class, priority = 1)
    public void testDoubleSqrtNegTest(double x) throws InterruptedException {
       calculator.sqrt(x);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 4)
    public void testDoubleTanPosTest(double x, double res) throws InterruptedException {
        Assert.assertEquals(calculator.tg(x), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderDouble", groups = "double", expectedExceptions = IllegalArgumentException.class, priority = 1)
    public void testDoubleTanNegTest(double x) throws InterruptedException {
        calculator.tg(x);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 2)
    public void testDoubleCTanPosTest(double x, double res) throws InterruptedException {
        Assert.assertEquals(calculator.ctg(x), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderDouble", groups = "double", expectedExceptions = IllegalArgumentException.class, priority = 2)
    public void testDoubleCTanNegTest(double x) throws InterruptedException {
        calculator.ctg(x);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 1)
    public void testDoubleCosPosTest(double x, double res) throws InterruptedException {
        Assert.assertEquals(calculator.cos(x), res);
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderDouble", groups = "double", priority = 1)
    public void testDoubleSinPosTest(double x, double res) throws InterruptedException {
        Assert.assertEquals(calculator.sin(x), res);
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 3)
    public void testLongIsPosPosTest(long x) throws InterruptedException {
        Assert.assertTrue(calculator.isPositive(x));
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 2)
    public void testLongIsPosNegTest(long x) throws InterruptedException {
        Assert.assertFalse(calculator.isPositive(x));
        Thread.sleep(1000);
    }

    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 2)
    public void testLongIsNegPosTest(long x) throws InterruptedException {
        Assert.assertTrue(calculator.isNegative(x));
        Thread.sleep(1000);
    }
    @Test(dataProvider = "DataProviderLong", groups = "long", priority = 1)
    public void testLongIsNegNegTest(long x) throws InterruptedException {
        Assert.assertFalse(calculator.isNegative(x));
        Thread.sleep(1000);
    }

}
