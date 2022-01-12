// Amari Lombel, 1/10/22, AP Data Labs 2022 v0.5

public class cereal
{

    private String Name;
    private double cups;
    private double fiber;
    private double FPC;

    public Cereal( String cerealName , double fiber, double cups, double fiberPerCups)

    {
    name = cerealName;
    fiber = fiber;
    cups = cups;
    FPC = fiberPerCups;



    }

    public Cereal()
    {
        cerealName = "";
        fiber = 0.0;
        cups = 0.0;
        FPC = 0.0


    }
    // Getters
    public String getName()
    {
        return name;
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
    return "cereal: " + name + "\nfibercontent: " + fiber + "\nserving size (in cups): " + cups +"\nfiber per cup: " + FPC;

}

public static void main(String[]args)
{ 
 Cereal food1 = new Cereal();
  System.out.println(food1.toString());

 
}


}
