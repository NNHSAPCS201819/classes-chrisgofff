import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private House home;
    private House home2;
    private Sun sunny;
    private Cloud cloud1;
    private Road mainStreet;
    private Grass frontYard;
    private Sky atmosphere;
    private Cloud cloud2;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    Color earlySky = new Color(30,144,255);
    public CityscapeComponent()
    {
        this.home = new House(200, 400, Color.DARK_GRAY, Color.RED);
        this.home2 = new House(700, 400, Color.MAGENTA, Color.BLACK);
        this.sunny = new Sun(500, 100);
        this.cloud1 = new Cloud(200, 100);
        this.mainStreet = new Road(0, 675);
        this.frontYard = new Grass(0, 500);
        this.atmosphere = new Sky(0, 0, earlySky);
        this.cloud2 = new Cloud(650, 150);
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        atmosphere.draw(g2);
        sunny.draw(g2);
        frontYard.draw(g2);
        home.draw(g2);
        home2.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        mainStreet.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        sunny.animate();
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    
}
