import java.util.Scanner;

class Forcounter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a starting number for the countdown: ");
        int Value = input.nextInt();

        
        
        for (int counter = Value; counter >= 1; counter--) {
            
            System.out.println(+counter);
        }

               
        
    }
}
