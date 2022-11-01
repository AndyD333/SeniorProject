package seniorproject;

public class Gate implements Source, Destination
{
    //0 = AND
    //1 = OR
    //2 = NOR
    //3 = NAND
    //4 = NOR
    //5 = XOR
    private int typeNumber;
    
    private Source sourceL;
    private Source sourceR;
    private boolean powered;
    
    public Gate()
    {
        this.typeNumber = 0;
	this.powered = false;
    }
    
    public Gate(int a, Source l, Source r)
    {
        this.sourceL = l;
        this.sourceR = r;
        this.typeNumber = a;
	this.powered = false;
    }
    
    public int getType()
    {
        return this.typeNumber;
    }
    
    public Source getSourceL()
    {
        return this.sourceL;
    }
    
    public Source getSourceR()
    {
        return this.sourceR;
    }

     
    public void updatePower()
    {
  
        if(this.typeNumber == 0)//OR GATE
        {
            if(this.sourceL.getPower() && this.sourceR.getPower())
            {
                this.powered = true;
            }
        }
        else if(this.typeNumber == 1)//AND GATE
        {
            if(this.sourceL.getPower() && this.sourceR.getPower())
            {
                this.powered = true;
            }
        }
        else if(this.typeNumber == 2)//NOT, NAND, NOR, XOR
        {
            if(!this.sourceL.getPower())
            {
                this.powered = true;
            }
        }
        else if(this.typeNumber == 3)//NAND GATE
        {
            if(!this.sourceR.getPower() || !this.sourceL.getPower())
            {
                this.powered = true;
            }
        }
        else if(this.typeNumber == 4)
        {
            if(!this.sourceR.getPower() && !this.sourceL.getPower())
            {
                this.powered = true;
            }
        }
        if(this.sourceR.getPower() != this.sourceL.getPower())
        {
            this.powered = true;
        }
    }

    public boolean getPower()
    {
        updatePower();
        if(this.powered)
        {
            System.out.println("ON!");
        }
        else
        {
            System.out.println("OFF!");
        }
	return this.powered;
    }

    @Override
    public boolean getSourcePower() {
        return sourceL.getPower();
    }
}
