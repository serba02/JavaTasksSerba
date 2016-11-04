package tests;

import dataProvider.ReaderXLS;
import org.testng.annotations.*;
import ua.epam.Calculator;

import java.lang.reflect.Method;

/**
 * Created by Lev_Serba on 10/31/2016.
 */
public class TestBase {
    Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void beforeTest(){
        calculator = new Calculator();
    }

    @DataProvider(name = "DataProviderDouble", parallel = true)
    public static Object[][] getDataDouble(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet, true);
    }

    @DataProvider(name = "DataProviderLong", parallel = true)
    public static Object[][] getDataLong(Method method) {
        String nameSheet = method.getName().toString();
        ReaderXLS readerXLS = new ReaderXLS();

        return readerXLS.parse(nameSheet, false);
    }
}
