package projectforjava;

public class ProjectForJavaRunner
{
    public static void main(String[] args)
    {
        Button on = new Button(true);
        Button off = new Button(false);
        
        if(on.getPower())
        {
            System.out.println("on works");
        }
        if(!off.getPower())
        {
            System.out.println("off works");
        }
        System.out.println("ye");
    }
}
