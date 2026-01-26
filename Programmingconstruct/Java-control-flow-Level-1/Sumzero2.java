import java.util.Scanner;

public class Sumzero {
    public static void main(String[] args) {
        double total = 0.0;
        Scanner sc = new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            
            if (input <= 0) {
                break; 
            }

            
            total += input;
        }

       
        System.out.println("The final sum is: " + total);
        
       
    }
}
