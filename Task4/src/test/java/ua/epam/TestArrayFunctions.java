package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lev_Serba on 9/16/2016.
 */
public class TestArrayFunctions {
    @Test
    public void testEmptyArray() throws Exception {
        int[] array = new int[0];
        int value = 7;
        int[] expectedArray = new int[0];
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testNoCoincidenceArray() throws Exception {
        int[] array = {1,13,42,16,78,21};
        int value = 17;
        int[] expectedArray = {};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testOneCoincidenceMidleArray() throws Exception {
        int[] array = {1,13,42,16,78,21};
        int value = 42;
        int[] expectedArray = {2};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testOneCoincidenceBeginningArray() throws Exception {
        int[] array = {1,13,42,16,78,21};
        int value = 1;
        int[] expectedArray = {0};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testManyCoincidenceMidleArray() throws Exception {
        int[] array = {1,13,42,13,13,21};
        int value = 13;
        int[] expectedArray = {1, 3, 4};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testManyCoincidenceMidleBeginningArray() throws Exception {
        int[] array = {13,42,13,13,21};
        int value = 13;
        int[] expectedArray = {0, 2, 3};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    public void testManyCoincidenceMidleEndArray() throws Exception {
        int[] array = {1,13,13,12,13};
        int value = 13;
        int[] expectedArray = {1, 2, 4};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testManyCoincidenceFullArray() throws Exception {
        int[] array = {13,13,13,13,13};
        int value = 13;
        int[] expectedArray = {0,1,2,3,4};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMaxIntValueInArray() throws Exception {
        int[] array = {12,Integer.MAX_VALUE,42,13,7};
        int value = Integer.MAX_VALUE;
        int[] expectedArray = {1};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testMinIntValueInArray() throws Exception {
        int[] array = {12,Integer.MIN_VALUE,42,13,7};
        int value = Integer.MIN_VALUE;
        int[] expectedArray = {1};
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testNegativeArraySizeException() throws Exception {
        int[] array = new int[-2];
        int value = 4;
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointer() throws Exception {
        int[] array = null;
        int value = 21;
        int[] actualArray = ArrayFunctions.createArrayOfValuesIndexes(array, value);
    }
}