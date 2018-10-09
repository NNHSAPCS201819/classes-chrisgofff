import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;
public class House
{
    private int yTop;
    private int xLeft;
    
    
    public House(int x, int y)
    {
        xLeft = x;
        yTop = y;
        
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double base = new Rectangle2D.Double(xLeft, yTop, 100, 100);
        g2.setColor(Color.RED);
        g2.fill(base);
        g2.draw(base);
        
        Rectangle2D.Double door = new Rectangle2D.Double(xLeft + 42, yTop + 68, 16, 32);
        g2.setColor(Color.white);
        g2.fill(door);
        g2.draw(door);
        
        Rectangle2D.Double window1 = new Rectangle2D.Double(xLeft + 15, yTop + 20, 20, 20);
        g2.setColor(Color.white);
        g2.fill(window1);
        g2.draw(window1);
        
        Rectangle2D.Double window2 = new Rectangle2D.Double(xLeft + 65, yTop + 20, 20, 20);
        g2.setColor(Color.white);
        g2.fill(window2);
        g2.draw(window2);
        
        Polygon roof = new Polygon();
        roof.addPoint(xLeft, yTop);
        roof.addPoint(xLeft + 100, yTop);
        roof.addPoint(xLeft + 50, yTop - 50);
        g2.setColor(Color.BLACK);
        g2.fill(roof);
        g2.draw(roof);
        
    }
}
