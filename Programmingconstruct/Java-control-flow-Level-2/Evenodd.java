import java.util.Scanner;
class Evenodd{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.println("enter the number ");
		a=input.nextInt();
		
		
		for(int i=1;i<=a;i++)
		{
			if (i%2==0)
			{
				System.out.println("the even number is: "+i);
				
			}
			else 
			{
				System.out.println("the odd number is: "+i);
			}
		}
		
	}
}