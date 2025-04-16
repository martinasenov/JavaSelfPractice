package PracticeTasks;

public class RemoveVowelsAndSpaces {


    public static void main(String[] args) {

        String str="i know kung fu";
        String vowels="aeiou ";
        String result="";

        for (int i = 0; i <str.length() ; i++) {

            boolean IsUnique=true;

            for (int j = 0; j <vowels.length() ; j++) {
                if(str.charAt(i)==vowels.charAt(j)){
                    IsUnique=false;
                    break;
                }
            }

            if (IsUnique){
                result+=str.charAt(i);
            }

        }

        System.out.println(result);

        System.out.println(removeVowels(str));

    }


    public static String removeVowels(String word){

        String vowels="aeiou ";
        String result="";

        for (int i = 0; i < word.length(); i++) {

            if (!vowels.contains(word.charAt(i)+"")){

                result+=word.charAt(i)+"";
            }

        }

        return result;
    }
}


/*

Given a string str, write a method that removes the vowels 'a', 'e', 'i', 'o', 'u' and spaces from it, and returns the new string.

Example 1:

         Input: "write once run anywhere"
         Output: "wrtncrnnywhr"

Example 2:
        Input: "everything is an object"
        Output: "vrythngsnbjct"


Example 3:
        Input: "ae iou"
        Output: ""

*/
