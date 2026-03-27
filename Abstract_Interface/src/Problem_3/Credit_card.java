package Problem_3;
public class Credit_card implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Paid using Credit Card: " + amount);
    }
}
