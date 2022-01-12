// Amari Lombel, 1/10/22, AP Data Labs 2022 v0.5.5

public class Cereal
{

    private String Name;
    private double cups;
    private double fiber;
    private double FPC;

    public Cereal( String cerealName , double fiber, double cups, double fiberPerCups)

    {
    Name = cerealName;
    fiber0 = fiber;
    cups = cups;
    FPC = fiberPerCups;



    }

    public Cereal()
    {
        Name = "";
        fiber0 = 0.0;
        cups = 0.0;
        FPC = 0.0;


    }
    // Getters
    public String getName()
    {
        return Name;
    }
    public double getFiber()
    {
        return fiber;
    }public double  getCups()
    {
        return cups;
    }public double getFPC()
    {
        return FPC;
    }

// toString method 
public String toString()
{
    return "cereal: " + Name + "\nfibercontent: " + fiber + "\nserving size (in cups): " + cups +"\nfiber per cup: " + FPC;

}

public static void main(String[]args)
{ 
    Cereal food1 = new Cereal();
    System.out.println(food1.toString());
    
    Cereal food2 = new Cereal("cap'n crunch", 0.0, 0.75, 0.0);
    System.out.println(food2.toString());

}


    








}
