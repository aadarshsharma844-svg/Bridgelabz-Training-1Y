import java.util.Scanner;
class Natural
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number ");
		int i=input.nextInt();
		
		if(i>0){
			System.out.println("It is natural no ");
			int sum= i * (i+1) / 2;
			System.out.println("sum of natural no=" +sum );
			
		}
		else 
		{
			System.out.println("It is invalid ");
		}
			
		
		
		
	}
	
	
	
	
}