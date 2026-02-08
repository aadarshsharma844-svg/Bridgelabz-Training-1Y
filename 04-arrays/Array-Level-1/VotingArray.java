import java.util.Scanner;

 class Voting {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
      
        int age[] = new int[10];
		System.out.println("enter the age of students");
		for(int i=0;i<10;i++){
			age[i]=input.nextInt();
		}
		for(int i=0;i<10;i++){
			if(age[i]>=18){
				System.out.println("Student can vote");
			}
			else{
				System.out.println("student do not vote");
			}
       
}
}
}