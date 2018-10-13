import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Creates a sky for your picture
 *
 * @author Chris Goff
 * @version 10/12/18
 */
public class Sky
{
    private int xLeft;
    private int yTop;
    private Color skyColor;
    
    /**
     * Constructs a new Sky object with the specified coordinates and color
     * 
     * @param   x   the x coordinate for the top left of the object
     * @param   y   the y coordinate for the top left of the object
     * @param   Color   the color of the sky
     */
    public Sky(int x, int y, Color color)
    {
        this.xLeft = x;
        this.yTop = y;
        this.skyColor = color;
    }
    Color earlySky = new Color(30,144,255);
    
    /**
     * Defines what the Sky object looks like using the instance variables
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky = new Rectangle2D.Double(xLeft, yTop, 1000, 850);
        g2.setColor(skyColor);
        g2.fill(sky);
        g2.draw(sky);
    }
    
}
