package Problem_4;
public class Runner
{
    public static void main(String[] args)
    {
        double km = 100;
        double kg = 9;
        double miles = Unit_Converter.kmToMiles(km);
        double lbs = Unit_Converter.kgToLbs(kg);
        System.out.println("Miles: " + miles);
        System.out.println("Pounds: " + lbs);
    }
}

