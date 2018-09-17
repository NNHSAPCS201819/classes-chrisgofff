public class Door
{
    private String front;
    private String side;
    public boolean state;
    private String name;
    
    public void open(String name)
    {
     
    }
    
    public void close(String name)
    {
    }
    
    public Door(String name, boolean state)
    {
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean getState(String name)
    {
        return this.state;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    Door door = new Door(front, false);
   
    
}