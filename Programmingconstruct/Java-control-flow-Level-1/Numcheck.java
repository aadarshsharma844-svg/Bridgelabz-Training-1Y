import java.util.Scanner;
class Numcheck
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=input.nextInt();
		
		if(number==0){
			System.out.println("number is zero");
		}
		else if(number<0)
		{
			
			System.out.println("number is negative");
		}
		else 
		{
			System.out.println("number is positive");
		}
			
		
		
		
	}
	
	
	
	
}