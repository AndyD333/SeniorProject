package projectforjava;

public class Light
{
    private boolean powered;
    private Gate supply;
    
    public Light()
    {
        this.powered = false;
    }
    
    public Light(Gate g)
    {
        this.supply = g;
    }
    
    public void updatePower()
    {
        if(this.supply.getPower())
        {
            this.powered = true;
        }
        else
        {
            this.powered = false;
        }
    }
    
    public boolean getPower()
    {
        updatePower();
	return this.powered;
    }
}

