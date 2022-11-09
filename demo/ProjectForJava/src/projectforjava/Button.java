package projectforjava;

import java.awt.*;

public class Button implements Source
{
    private boolean powered;


    public Button()
    {
        powered = false;
    }
    
    public Button(boolean p)
    {
        powered = p;
    }
    
    public boolean getPower()
    {
        return powered;
    }
    
    public void switchPower()
    {
        powered = !powered;
    }
    
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.PINK);
        g.fillOval(0, 0, 50, 50);
    }
}
