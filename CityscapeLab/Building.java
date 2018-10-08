import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
public class Building
{
    private double yTop;
    private double xLeft;
    
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double tower = new Rectangle2D.Double(xLeft, yTop, 100, 500);
        g2.fill(tower);
        g2.draw(tower);
        
        Rectangle2D.Double window = new Rectangle2D.Double(xLeft + 10, yTop + 10,
                30, 40);
        g2.setColor(Color.YELLOW);
        g2.fill(window);
        g2.draw(window);
        
        Rectangle2D.Double window2 = new Rectangle2D.Double(xLeft + 60, yTop + 10,
                30, 40);
        g2.setColor(Color.YELLOW);
        g2.fill(window2);
        g2.draw(window2);
    }
}