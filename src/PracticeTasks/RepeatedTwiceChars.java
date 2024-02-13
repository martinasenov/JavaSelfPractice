package PracticeTasks;

public class RepeatedTwiceChars {

    public static void main(String[] args) {

        String str = "aaabbccccddeeeeff";

        String result = "";

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i); // each character of str
            int count=0;

            for (int j = 0; j <str.length() ; j++) { // responsible for comparing ch to each character of str and return the frequency of ch

                if(str.charAt(j)==ch){
                    count++;
                }
            }


                if(count==2 && !result.contains(""+ch)) {

                    result += ch;

                }


        }

        System.out.println(result);



    }


}



//find the chars that are repeated twice

