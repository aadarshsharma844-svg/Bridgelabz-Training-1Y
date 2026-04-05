package Assignment_13;
import java.util.Scanner;

public class Ques_1 {


        public void primitiveToWrapper(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the no");
            int num1=sc.nextInt();
            Integer num2=num1;
            System.out.println("primitive:"+num1);
            System.out.println("Wrapper:"+num2);


        }

        public static void main(String[] args) {
            Ques_1 q1=new Ques_1();
            q1.primitiveToWrapper();
        }
    }

