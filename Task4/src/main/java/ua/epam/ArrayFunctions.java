package ua.epam;

import java.util.Arrays;

public class ArrayFunctions {

    public static int[] createArrayOfValuesIndexes(int[] array, int value){

        int[] indexArray = new int[array.length];
        int val = value;
        int j=0;
        for(int i=0; i<array.length; i++)
        {
            if(array[i] == value)
            {
                indexArray[j] = i;
                j++;
            }
        }
        indexArray = Arrays.copyOf(indexArray, j);
        return indexArray;
    }
}
