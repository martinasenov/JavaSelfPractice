package week_34_AlgoQuestions;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "the    sky      is       blue      ";
        String s1 = " hello                  world ";
        String s2 = "    a         good       example          ";

        System.out.println(reverseWordsInString(s));
        System.out.println(reverseWordsInString(s1));
        System.out.println(reverseWordsInString(s2));


    }

    public static String reverseWordsInString(String word){
        String result="";
        word=word.trim();
        String [] words= word.split(" ");

        for (int i = words.length-1; i >=0 ; i--) {

            words[i]=words[i].trim();

            if (!words[i].isEmpty()) {
                result += " " + words[i];
            }
        }
        return result.trim();
    }





}
