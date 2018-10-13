import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;
/**
 * Creates a house for your picture
 *
 * @author Chris Goff
 * @version 10/12/18
 */
public class House
{
    private int yTop;
    private int xLeft;
    private Color houseColor;
    private Color roofColor;
    /**
     * Constructs a new House object with the specified coordinates, wall color, and roof
     *      color
     * 
     * @param   x   the x coordinate for the top left of the object
     * @param   y   the y coordinate for the top left of the object
     * @param   inHouseColor    the color of the walls of the house
     * @param   inRoofColor     the color of the roof of the house
     */
    public House(int x, int y, Color inHouseColor, Color inRoofColor)
    {
        this.xLeft = x;
        this.yTop = y;
        this.houseColor = inHouseColor;
        this.roofColor = inRoofColor;
    }
    /**
     * Defines what the House object looks like using the instance variables
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double base = new Rectangle2D.Double(xLeft, yTop, 200, 200);
        g2.setColor(houseColor);
        g2.fill(base);
        g2.draw(base);
        
        Rectangle2D.Double door = new Rectangle2D.Double(xLeft + 84, yTop + 136, 32, 64);
        g2.setColor(Color.white);
        g2.fill(door);
        g2.draw(door);
        
        Rectangle2D.Double window1 = new Rectangle2D.Double(xLeft + 30, yTop + 40, 40, 40);
        g2.setColor(Color.white);
        g2.fill(window1);
        g2.draw(window1);
        
        Rectangle2D.Double window2 = new Rectangle2D.Double(xLeft + 130, yTop + 40, 40, 40);
        g2.setColor(Color.white);
        g2.fill(window2);
        g2.draw(window2);
        
        Polygon roof = new Polygon();
        roof.addPoint(xLeft, yTop);
        roof.addPoint(xLeft + 200, yTop);
        roof.addPoint(xLeft + 100, yTop - 100);
        g2.setColor(roofColor);
        g2.fill(roof);
        g2.draw(roof);
        
    }
}
