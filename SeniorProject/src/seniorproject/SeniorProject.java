package seniorproject;

public class SeniorProject
{
    public static void main(String[] args) {
        Button on = new Button(true);
        Button off = new Button(false);
        
        Gate orA = new Gate(5, on, on);
        Gate orB = new Gate(5, on, off);
        Gate orC = new Gate(5, off, on);
        Gate orD = new Gate(5, off, off);
        orA.getPower();
        orB.getPower();
        orC.getPower();
        orD.getPower();
    }
}
