import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Bredok on 25.09.2016.
 */
public class DriverCarIntrTests {
    @Test(expected = IllegalArgumentException.class)
    public void testDriverALicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.A);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverBLicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.B);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }

    @Test
    public void testDriverCLicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.C);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");

        Assert.assertTrue(cat.contains(car.getCategory()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverDLicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.D);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverELicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.E);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }

    @Test
    public void testDriverACLicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.C);
        cat.add(DriverLicense.Category.A);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");

        Assert.assertTrue(cat.contains(car.getCategory()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverABDLicenseForGasolineCar() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.B);
        cat.add(DriverLicense.Category.A);
        cat.add(DriverLicense.Category.D);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        GasolineCar car = new GasolineCar("ZAZ", "AA5555AA", "100500", DriverLicense.Category.C, 1499, 80, GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverALicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.A);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverBLicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.B);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");
    }

    @Test
    public void testDriverCLicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.C);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");

        Assert.assertTrue(cat.contains(truck.getCategory()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverDLicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.D);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverELicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.E);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");
    }

    @Test
    public void testDriverCEDLicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.C);
        cat.add(DriverLicense.Category.E);
        cat.add(DriverLicense.Category.D);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");

        Assert.assertTrue(cat.contains(truck.getCategory()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverADLicenseForTruck() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.A);
        cat.add(DriverLicense.Category.D);
        driverLicense.setCategories(cat);

        Human john = new Human("John", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john, new DriverLicense(new Date(), cat, new Date()));
        Truck truck = new Truck("fwf","frsfsr","fvwrfwr",DriverLicense.Category.C, 3203, 34, Truck.Transmission.MECHANICAL, 15000, 25000);
        Route route = new Route(truck , johnDriver , "Troeshina" , "Klovska");
    }

    /**
     * 2 equal category shouldnt be duplicated in array
     */
    @Test
    public void testDuplicateInDriverLicense() throws Exception {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        List<DriverLicense.Category> expectedArray = new ArrayList<DriverLicense.Category>();
        DriverLicense driverLicense = new DriverLicense();

        cat.add(DriverLicense.Category.A);
        cat.add(DriverLicense.Category.B);
        cat.add(DriverLicense.Category.C);
        cat.add(DriverLicense.Category.A);
        cat.add(DriverLicense.Category.B);
        cat.add(DriverLicense.Category.C);
        driverLicense.setCategories(cat);
        List<DriverLicense.Category> actualArray = driverLicense.getCategories();
        expectedArray.add(DriverLicense.Category.A);
        expectedArray.add(DriverLicense.Category.B);
        expectedArray.add(DriverLicense.Category.C);

        Assert.assertEquals(expectedArray, actualArray);
    }

    /**
     * expires date cant be before fromDate
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectBeginEndDateConstructor() {
        List<DriverLicense.Category> cat = new ArrayList<DriverLicense.Category>();
        cat.add(DriverLicense.Category.A);
        DriverLicense driverLicense = new DriverLicense(new Date(2015, 07, 07), cat, new Date(2016, 02, 04));
    }

    /**
     * expires date cant be before fromDate
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectBeginEndDateSetters() {
        DriverLicense driverLicense = new DriverLicense();
        driverLicense.setExpires(new Date(2015, 07, 07));
        driverLicense.setFromDate(new Date(2016, 02, 04));
    }


    /**
     * Driver must be 18+
     */
    @Test
    public void testDriverAge() {
        int currentYear = Year.now().getValue();
        Human john = new Human("John" , new Date(2000, 07, 07) , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Driver johnDriver = new Driver(john ,new DriverLicense(new Date() ,
                DriverLicense.Category.C , new Date()));
        Assert.assertTrue((currentYear-johnDriver.getHuman().getBirthDate().getYear())>=18);
    }

    /**
     * Date of birth must be before current date
     */
    @Test
    public void testHumanAge() {
        int currentMonth = new Date().getMonth();
        int currentDay = new Date().getDay();
        int currentYear = Year.now().getValue();

        Date currentDate = new Date(currentYear, currentMonth, currentDay);
        Date birthDate = new Date(2017, 04, 07);
        Human john = new Human("John" , birthDate , Human.Gender.MALE , Human.BloodGroup.FIRST);
        Assert.assertTrue(birthDate.before(currentDate));
    }
}