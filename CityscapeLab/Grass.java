import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Creates some grass for your picture
 *
 * @author Chris Goff
 * @version 10/12/18
 */
public class Grass
{
    private int xLeft;
    private int yTop;

    /**
     * Constructs a new Grass object with the specified coordinates
     * 
     * @param   x   the x coordinate for the top left of the object
     * @param   y   the y coordinate for the top left of the object
     */
    public Grass(int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * Defines what the Grass object looks like using the instance variables
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double yard = new Rectangle2D.Double(xLeft, yTop, 1000, 350);
        g2.setColor(Color.GREEN);
        g2.fill(yard);
        g2.draw(yard);
    }
}
