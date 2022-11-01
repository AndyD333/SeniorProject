package seniorproject;

public class Gate implements Source, Destination
{
    //0 = AND
    //1 = OR
    //2 = NOT
    //3 = NAND
    //4 = NOR
    //5 = XOR
    private static int typeNumber;
    
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
        return sourceR;
    }
    
    public void updatePower()
    {
        switch (this.typeNumber)
        {
            //AND GATE
            case 0:
                if(this.sourceR.getPower() & this.sourceL.getPower())
                {
                    this.powered = true;
                }
                else
                {
                    this.powered = false;
                }
                break;
                
            //OR GATE
            case 1:
                if(this.sourceR.getPower() | this.sourceL.getPower())
                {
                    this.powered = true;
                }
                else
                {
                    this.powered = false;
                }
                break;
             
            //NOT GATE
            case 2:
                if(this.sourceR.getPower())
                {
                    this.powered = false;
                }
                else
                {
                    this.powered = true;
                }
                break;
                
            //NAND GATE
            case 3:
                if(this.sourceR.getPower() & this.sourceL.getPower())
                {
                    this.powered = false;
                }
                else
                {
                    this.powered = true;
                }
                break;
                
            //NOR GATE
            case 4:
                if(this.sourceR.getPower() | this.sourceL.getPower())
                {
                    this.powered = false;
                }
                else
                {
                    this.powered = true;
                }
                break;
            
            //XOR GATE
            case 5:
                if((this.sourceL.getPower() & !this.sourceR.getPower()) | (this.sourceR.getPower() & !this.sourceL.getPower()))
                {
                    this.powered = true;
                }
                else
                {
                    this.powered = false;
                }
                break;
                
            default:
                this.powered = false;
                break;
        }
    }

    public boolean getPower()
    {
        updatePower();
        if(powered)
        {
            System.out.println("ON!");
        }
        else
        {
            System.out.println("OFF!");
        }
	return powered;
    }

    @Override
    public boolean getSourcePower() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
