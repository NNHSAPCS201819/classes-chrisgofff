
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
    private String vin; // vehicle identification number
    
    /*
     * Constructor:
     *      responsible for initializing newly created objects
     *      invoked automatically via the new operator
     *      name of the consructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another contructor (with restrictions)
     */
    
    /**
     * Default constructor for the Car class.
     *      Inizializes the fuel efficiency to 30 mpg and the fuel in this
     *          car's tank to 0 gallons
     */
    public Car()
    {
        /*
         * the "this" reserved word references the current object
         *  Its usage is encouraged but usually not required
         */
        this.fuelEfficiency = 30;
        this.fuelInTank = 0;
        this.vin = "";
    }
    
    /**
     * Constructs a new Car object with the specified fuel efficiency
     * 
     * @param   initialEfficiency   the initial fuel efficiency, in mpg, of this 
     *                              new car
     */
    public Car(double initialEfficiency)
    {
        /*
         * If the parameter was named fuelEfficiency, it would shadow the
         *      instance variable fuelEfficiency.
         * Local and parameter variables "shadow" instance variables of the same
         *      name. In this code, fuelEfficiency would refer to the parameter
         *      and not the instance variable
         * To refer explicitly to an instance variable, use "this"
         * Advice: avoid this issue by giving parameters and local variables
         *      unique names
         */
        this.fuelEfficiency = initialEfficiency;
        this.fuelInTank = 0;
        this.vin = "";
    }
    
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
        double fuelConsumed = distance / this.fuelEfficiency;
        this.fuelInTank -= fuelConsumed;
    }
    
    /**
     * Adds the specified amount of fuel to this cars tank
     * 
     * @param   amount   the amount of fuel, in gallons, to add to this cars tank
     */
    public void addFuel(double amount)
    {
        this.fuelInTank += amount;
    }
    
    /**
     * Returns the amount of fuel in this cars tank
     * 
     * @return the amount of fuel, in gallons, in this cars tank
     */
    public double getFuelInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Returns the VIN of this car 
     * 
     * @return the VIN of this car
     */
    public String getVIN()
    {
        return "";
    }
    
    /**
     * Sets the VIN of this car
     * 
     * @param   newVIN    the VIN of this car
     */
    public void setVIN(String newVIN)
    {
        
    }
}
