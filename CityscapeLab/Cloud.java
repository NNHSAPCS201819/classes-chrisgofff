import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Cloud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cloud
{
    private int xLeft;
    private int yTop;
    
    public Cloud(int x, int y)
    {
     this.xLeft = x;
     this.yTop = y;
    }
    
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
