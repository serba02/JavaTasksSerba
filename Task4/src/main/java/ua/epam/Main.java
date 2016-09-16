package ua.epam;

import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

	    int[] array = {2,3,2,6,2,7,2,8,12,14,15,16,2,7,34,56};
        int value = 2;
        int[] arrayOfIndexes = ArrayFunctions.createArrayOfValuesIndexes(array, value);
        System.out.println(Arrays.toString(arrayOfIndexes));

    }
}
