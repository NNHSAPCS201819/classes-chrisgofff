

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
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
    public void testMachine()
    {
        VendingMachine vend = new VendingMachine(10);
        vend.buyCan(5);
        int amount = vend.getCanCount();
        assertEquals(5,amount);
        
        int amount2 = vend.getTokenCount();
        assertEquals(5,amount2);
    }
}
