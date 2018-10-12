import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Creates a grass object
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grass
{
    private int xLeft;
    private int yTop;

    /**
     * 
     */
    public Grass(int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double yard = new Rectangle2D.Double(xLeft, yTop, 1000, 350);
        g2.setColor(Color.GREEN);
        g2.fill(yard);
        g2.draw(yard);
    }
}
