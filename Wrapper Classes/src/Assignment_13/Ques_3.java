package Assignment_13;
import java.util.ArrayList;
import java.util.List;

    public class Ques_3 {
        public void autoUnBoxing(){
            List<Integer> list=new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            System.out.println("List is"+list);
            int sum=0;
            for(Integer num:list){
                sum+=num;
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            Ques_3 q3=new Ques_3();
            q3.autoUnBoxing();
        }
    }


