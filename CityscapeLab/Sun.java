import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Write a description of class Sun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sun
{
    private int xLeft;
    private int yTop;
    
    public Sun(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D sun = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }
}
