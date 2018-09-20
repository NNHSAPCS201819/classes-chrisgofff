public class VendingMachine
{
    private int cans;
    private int tokens;
    
    public void buyCan(int number)
    {
        this.cans = (cans - number);
        this.tokens = (tokens + number);
    }
    
    public void VendingMachine()
    {
        this.cans = 10;
        this.tokens = 0;
    }
    
    public VendingMachine(int initialCans)
    {
        this.cans = initialCans;
        this.tokens = 0;
    }
    
    public int getCanCount()
    {
        return cans;
    }
    
    public int getTokenCount()
    {
        return tokens;
    }
    
}