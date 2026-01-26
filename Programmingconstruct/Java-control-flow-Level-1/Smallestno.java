import java.util.Scanner;
class Smallestno
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the num1 ");
		int num1=input.nextInt();
		System.out.println("Enter the num2 ");
		int num2=input.nextInt();
		System.out.println("Enter the num3 ");
		int num3=input.nextInt();
		if(num1<num2 && num1<num3){
			System.out.println("num1 is smallest ");
		}
		else if(num2<num1 && num2<num3)
		{
			
			System.out.println("num2 is smallest");
		}
		else if(num3<num2 && num3<num1)
		{
			System.out.println("num3 is smallest");
		}
			
		
		
		
	}
	
	
	
	
}