import java.util.Scanner;
class counter  {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a starting number for the countdown: ");
        int counter = input.nextInt();

        
        while (counter >= 1) {
            
            System.out.println(+counter);
            counter--; 
        }

        
        
        
    }
}
