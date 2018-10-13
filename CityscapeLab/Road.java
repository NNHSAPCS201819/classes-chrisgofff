import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Creates a road for your picture
 *
 * @author Chris Goff
 * @version 10/12/18
 */
public class Road
{
    private int xLeft;
    private int yTop;
    /**
     * Constructs a new Road object with the specified coordinates
     * 
     * @param   x   the x coordinate for the top left of the object
     * @param   y   the y coordinate for the top left of the object
     */
    public Road(int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }
    /**
     * Defines what the Road object looks like using the instance variables
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double street = new Rectangle2D.Double(xLeft, yTop, 1000, 100);
        g2.setColor(Color.BLACK);
        g2.fill(street);
        g2.draw(street);
        
        Rectangle2D.Double divider = new Rectangle2D.Double(xLeft, yTop + 47, 1000, 6);
        g2.setColor(Color.YELLOW);
        g2.fill(divider);
        g2.draw(divider);
    }
}
