import javax.swing.JFrame;

public class EHPViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Targets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EHPComponent component = new EHPComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}