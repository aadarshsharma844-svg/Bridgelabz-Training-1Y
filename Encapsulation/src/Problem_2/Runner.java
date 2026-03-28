package Problem_2;
public class Runner
{
    public static void main(String[] args) {

        Product p1 = new Electronics(1, "Buds", 10000);
        Product p2 = new Clothings(2, "Jacket", 1500);
        Product p3 = new Groceries(3, "Pulses", 200);

        p1.display();
        p2.display();
        p3.display();
    }
}

