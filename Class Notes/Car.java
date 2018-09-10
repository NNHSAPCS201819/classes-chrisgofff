
/**
 * This class models a car.
 *
 * @author (chris goff)
 * @version (a version number or a date)
 */
public class Car
{
    /*
     * Instance variables store the objects properties
     *       specified the visibility (e.g. private)
     *             public: accesible by everyone
     *             private: only accesible by methods in this class
     *       specify the type (ex. double)
     *       specify the name (ex. fuelEfficiency, fuelInTank)
     *       
     *  Instance variables differ from local variables in the following ways:
     *       scoped to their class (accesible for all methods)
     *       automaticcally initialized to a default value (0, false, null)
     */
    private double fuelEfficiency; // in units of mpg
    private double fuelInTank; // in units of gallons
    
    /*
     * When defining a method, specify:
     *      the visibility (ex. public)
     *      the return type (ex. void)
     *      the method name (ex. drive)
     *      the parameters and their types (ex. distance of type double)
     */
    
    /**
     * Drives this car the specified distance consuming fuel
     * 
     * @param    distance   the distance, in miles, this car drives
     */
    public void drive(double distance)
    {
    }
    
    /**
     * Adds the specified amount of fuel to this cars tank
     * 
     * @param   amount   the amount of fuel, in gallons, to add to this cars tank
     */
    public void addFuel(double amount)
    {
    }
    
    /**
     * Returns the amount of fuel in this cars tank
     * 
     * @return the amount of fuel, in gallons, in this cars tank
     */
    public double getFuel()
    {
        return 0;
    }
}
