import java.util.Scanner;
 class FriendsComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

       
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        
    }
}
