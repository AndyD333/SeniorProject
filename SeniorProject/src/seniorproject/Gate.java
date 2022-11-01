package seniorproject;

public class Gate implements Source, Destination
{
    //0 = AND
    //1 = OR
    //2 = NAND
    //3 = NOR
    //4 = XOR
    private static int typeNumber;
    
    private static Source sourceL;
    private static Source sourceR;
    private boolean powered;
    
    public Gate()
    {
        typeNumber = 0;
	  powered = false;
    }
    
    public Gate(int a, Source l, Source r)
    {
        //SourceL = l;
        //SourceR = r;
        typeNumber = a;
	  powered = false;
    }
    
    public int getType()
    {
        return typeNumber;
    }
    
    public Source getSourceL()
    {
        return sourceL;
    }
    
    public Source getSourceR()
    {
        return sourceR;
    }

    public boolean getPower()
    {
	return powered;
    }
}
