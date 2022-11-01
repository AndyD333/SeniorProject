package seniorproject;

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
}
