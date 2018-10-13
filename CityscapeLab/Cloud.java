import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
/**
 * Creates a cloud for your picture
 *
 * @author Chris Goff
 * @version 10/12/18
 */
public class Cloud
{
    private int xLeft;
    private int yTop;
    /**
     * Constructs a new Cloud object with the specified coordinates
     * 
     * @param   x   the x coordinate for the top left of the object
     * @param   y   the y coordinate for the top left of the object
     */
    public Cloud(int x, int y)
    {
     this.xLeft = x;
     this.yTop = y;
    }
    /**
     * Defines what the Cloud object looks like using the instance variables
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D part1 = new Ellipse2D.Double(xLeft, yTop, 90, 90);
        g2.setColor(Color.lightGray);
        g2.fill(part1);
        g2.draw(part1);
        
        Ellipse2D part2 = new Ellipse2D.Double(xLeft+35, yTop-30, 90, 90);
        g2.setColor(Color.lightGray);
        g2.fill(part2);
        g2.draw(part2);
        
        Ellipse2D part3 = new Ellipse2D.Double(xLeft+70, yTop+5, 90, 90);
        g2.setColor(Color.lightGray);
        g2.fill(part3);
        g2.draw(part3);
    }
}
