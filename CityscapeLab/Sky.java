import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Write a description of class Sky here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sky
{
    private int xLeft;
    private int yTop;
    private Color skyColor;
    
    /**
     * Constructor for objects of class Sky
     */
    public Sky(int x, int y, Color color)
    {
        this.xLeft = x;
        this.yTop = y;
        this.skyColor = color;
    }
    Color earlySky = new Color(30,144,255);
    Color nightSky = new Color(25,25,112);
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky = new Rectangle2D.Double(xLeft, yTop, 1000, 850);
        g2.setColor(skyColor);
        g2.fill(sky);
        g2.draw(sky);
    }
    
    public void animate()
    {
        
        skyColor = nightSky;
    }
}
