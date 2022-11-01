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
    
    public Gate()
    {
        typeNumber = 0;
    }
    
    public Gate(int a, Source l, Source r)
    {
        //SourceL = l;
        //SourceR = r;
        typeNumber = a;
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
}
