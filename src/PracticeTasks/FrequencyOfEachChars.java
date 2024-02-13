package PracticeTasks;

public class FrequencyOfEachChars {


    public static void main(String[] args) {

        String str="AAABBBCCCDDDDDD";

        String result="";


        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch=str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {

               if(str.charAt(j)==ch) {
                   count++;
               }
            }

            if (!result.contains(ch+"")){
                result+=str.charAt(i)+""+count;
            }

        }

        System.out.println(result);


    }







}
