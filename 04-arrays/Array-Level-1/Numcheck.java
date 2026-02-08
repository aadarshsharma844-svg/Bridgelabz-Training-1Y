import java.util.Scanner;
class Numcheck{
	public static void main(String []args){
		Scanner input= new Scanner(System.in);
		int number[]= new int[5];
		System.out.println("Enter the number");
		for(int i=0;i<5;i++){
			number[i]=input.nextInt();
		}
		for(int i=0;i<5;i++){
			if(number[i]>0){
				System.out.println("Number is positive");
				if(number[i]%2==0){
					System.out.println("number is even");
				}
				 else{
					 System.out.println("number is odd");
				 }
			}
			else if(number[i]==0){
				System.out.println("number is equal zero");
			}
			else{
				System.out.println("number is negative");
			}
			
		}
		if( number[0]==number[4]){
				System.out.println("First and last number are equal");
		}
				else if( number[0]<number[4]){
					System.out.println("First number  < last number");
				}
				else {
					System.out.println("First number  > last number");
				}
				
					
				
}
}					 