// Amari Lombel, 1/10/22, AP Data Labs 2022 v0.4

public class cereal
{

    private String cerealName;
    private double cups;
    private double fiber;
    private double fiberPerCups;

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



}
