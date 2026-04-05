package Assignment_13;

    public class Ques_8 {
        public void methods(){
            String s1="Myroll_nois33";
            int letter=0,digits=0,special=0;
            for(int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
                if(Character.isLetter(ch)){
                    letter+=1;
                }
                else if(Character.isDigit(ch)){
                    digits+=1;
                }
                else {
                    special+=1;
                }
            }
            System.out.println("total letters are"+letter);
            System.out.println("total number are"+digits);
            System.out.println("total special character are"+special);
        }

        public static void main(String[] args) {
            Ques_8 q8=new Ques_8();
            q8.methods();



        }
    }


