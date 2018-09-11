

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarTest.
 *
 * @author  (chris goff)
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for test class CarTest
     */
    public CarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testgetFuelInTank()
    {
        Car testCar = new Car();
        double amount = testCar.getFuelInTank();
        
        /*
         * the assertEquals method varifies that the expected value is equal
         *      to the actual (returned) value. If not, the test fails.
         * Specify the expected value first and the actual value second
         * For doubles and only for doublesm speciy a third value which
         *      is the epsilon (how close is close to be equal)
         */
        assertEquals(0, amount, 1e-6);
    }
    
    @Test
    public void testAddFuel()
    {
        Car testCar = new Car(50);
        testCar.addFuel(10);
        double amount = testCar.getFuelInTank();
        assertEquals(10, amount, 1e-6);
        
        testCar.addFuel(5);
        amount = testCar.getFuelInTank();
        assertEquals(15, amount, 1e-6);
    }
    
    @Test
    public void testDrive()
    {
        Car testCar = new Car(50);
        testCar.addFuel(10);
        testCar.drive(25);
        double amount = testCar.getFuelInTank();
        assertEquals(9.5, amount, 1e-6);
        
        testCar.drive(100);
        amount = testCar.getFuelInTank();
        assertEquals(7.5, amount, 1e-6);
    }
}
