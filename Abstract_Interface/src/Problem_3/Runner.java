package Problem_3;
public class Runner
{
    public static void main(String[] args)
    {
        Payment p1 = new UPI();
        Payment p2 = new Credit_card();
        Payment p3 = new Wallet();

        p1.pay(300);
        p2.pay(1500);
        p3.pay(500);
    }
}

