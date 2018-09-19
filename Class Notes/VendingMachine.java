public class VendingMachine
{
    private int cans;
    private int tokens;
    
    public void buyCan(int number)
    {
        this.cans = (cans - number);
        this.tokens = (tokens + number);
    }
    
    public VendingMachine(int initialCans, int initialTokens)
    {
        this.cans = initialCans;
        this.tokens = initialTokens;
    }
    
    public int getCanCount()
    {
        return cans;
    }
    
    
    
}