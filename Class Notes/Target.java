import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Target here.
 *
 * @author Chris Goff
 * @version 9/20
 */
public class Target
{
   private int xLeft;
   private int yTop;
   
   public Target(int x, int y)
   {
       xLeft = x;
       yTop = y;
   }
   
   public void draw(Graphics2D g2)
   {
       Ellipse2D outerCircle = new Ellipse2D.Double(xLeft, yTop, 200, 200);
       g2.setColor(Color.RED);
       g2.fill(outerCircle);
       g2.draw(outerCircle);
       
       Ellipse2D middleCircle = new Ellipse2D.Double(xLeft + 25, yTop + 25, 150, 150);
       g2.setColor(Color.WHITE);
       g2.fill(middleCircle);
       g2.draw(middleCircle);
       
       Ellipse2D innerCircle = new Ellipse2D.Double(xLeft + 50, yTop + 50, 100, 100);
       g2.setColor(Color.RED);
       g2.fill(innerCircle);
       g2.draw(innerCircle);
   }
}
