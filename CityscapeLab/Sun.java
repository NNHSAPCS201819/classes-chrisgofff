import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Creates a sun for your picture
 *
 * @author Chris Goff
 * @version 10/12/18
 */
public class Sun
{
    private int xLeft;
    private int yTop;
    /**
     * Constructs a new Sun object with the specified coordinates
     * 
     * @param   x   the x coordinate for the top left of the object
     * @param   y   the y coordinate for the top left of the object
     */
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    /**
     * Defines what the Sun object looks like using the instance variables
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D sun = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }
    /**
     * Animates the sun object
     */
    public void animate()
    {
        yTop = yTop + 10;
    }
}
