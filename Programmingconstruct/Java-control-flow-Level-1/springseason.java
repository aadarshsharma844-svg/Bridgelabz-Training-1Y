import java.util.Scanner;
class springseason{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("month");
		int a=input.nextInt();
		System.out.println("date");
		int b= input.nextInt();
		if((a==3 && b>=20) || (a==4) || (a==5) || (a==6 && b<=20 ))
		{
			System.out.println("spring season: ");
		}
		else{
			System.out.println("not spring season");
		}
		
	}
}