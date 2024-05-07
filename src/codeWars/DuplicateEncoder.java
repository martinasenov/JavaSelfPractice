package codeWars;

import java.util.stream.Collectors;

public class DuplicateEncoder {


    public static String encode(String word){

        String newString="";
        word=word.toLowerCase();
                 //din
        for (int i = 0; i < word.length(); i++) {

            int counter=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    counter++;
                }
            }
            if (counter>1){

                newString+=")";
            }else {

                newString+="(";
            }
        }

        word=newString;

        return word;
    }



        static String encode2(String word){
            return word.toLowerCase()
                    .chars()
                    .mapToObj(i -> String.valueOf((char)i))
                    .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                    .collect(Collectors.joining());
        }


    public static void main(String[] args) {


        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));


    }


}


/*


The goal of this exercise is to convert a string to a new string where each character in the new string is "("
if that character appears only once in the original string, or ")" if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.



Examples:

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("


 */