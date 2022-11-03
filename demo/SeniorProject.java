package seniorproject;

public class SeniorProject
{
    public static void main(String[] args)
    {
        Button on = new Button(true);
        Button off = new Button(false);

        
        Gate andA = new Gate(0, on, on);
        Gate andB = new Gate(0, off, on);
        Gate andC = new Gate(0, on, off);
        Gate andD = new Gate(0, off, off);
        
        System.out.println("a: " + andA.getPower());
        System.out.println("b: " + andB.getPower());
        System.out.println("c: " + andC.getPower());
        System.out.println("d: " + andD.getPower());
        
        System.out.println("");
        System.out.println("");
        
        Gate orA = new Gate(1, on, on);
        Gate orB = new Gate(1, off, on);
        Gate orC = new Gate(1, on, off);
        Gate orD = new Gate(1, off, off);
        
        System.out.println("a: " + orA.getPower());
        System.out.println("a: " + orB.getPower());
        System.out.println("a: " + orC.getPower());
        System.out.println("a: " + orD.getPower());
        
        System.out.println("");
        System.out.println("");
        
        Gate notA = new Gate(2, on);
        Gate notB = new Gate(2, off);
        Gate notC = new Gate(2, on, off);
        Gate notD = new Gate(2, off, on);
        
        System.out.println("a: " + notA.getPower());
        System.out.println("a: " + notB.getPower());
        System.out.println("a: " + notC.getPower());
        System.out.println("a: " + notD.getPower());
        
        Gate combination = new Gate(0, notB, notD);
        System.out.println("combo: " + combination.getPower());
        
        Light l = new Light(combination);
        System.out.println("light: " + l.getPower());
    }
}
