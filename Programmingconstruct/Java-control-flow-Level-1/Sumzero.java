import java.util.Scanner;

class Sumzero {
    public static void main(String[] args) {
        
        double total = 0.0;
        double input;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (or 0 to stop): ");
        input = scanner.nextDouble();

        
        while (input != 0) {
            
            total += input;
            
            System.out.print("Enter another number (or 0 to stop): ");
            input = scanner.nextDouble();
        }

        
        System.out.println("The final sum is: " + total);
        
      
    }
}
