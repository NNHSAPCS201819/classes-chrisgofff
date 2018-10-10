import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Write a description of class Road here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Road
{
    private int xLeft;
    private int yTop;
    
    public Road(int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double street = new Rectangle2D.Double(xLeft, yTop, 1000, 100);
        g2.setColor(Color.BLACK);
        g2.fill(street);
        g2.draw(street);
    }
}
