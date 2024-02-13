package week11_AlgoQuestions;

public class BreakCamelCase {

    public static void main(String[] args) {

        System.out.println(breakCamelCase("weLoveProgramming"));

    }


    public static String breakCamelCase(String sentence){

        if(sentence==null){
            return "";
        }

        for (int i = 0; i < sentence.length(); i++) {

            if(Character.isUpperCase(sentence.charAt(i)) && sentence.charAt(i-1)!=' '){

                sentence=sentence.replace(sentence.charAt(i)+""," "+sentence.charAt(i));
            }

        }


        return sentence;
    }


}



/*

Question-1 Break Camel Case
Write a function, breakCamelCase, that takes a camel-cased string as input and returns a new string with spaces inserted between words.

The function should handle empty or null input.
Examples:
"camelCasing" => "camel Casing"
"weLoveProgramming" => "we Love Programming"
"identifier" => "identifier"
"" => ""
null => ""

 */