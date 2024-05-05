package codeWars;

public class ReverseWords {


    public static String reverseWords(final String original) {

        String temp="";
        String reversed="";

       char [] chars= original.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != ' ') {
                temp += chars[i];
            }

            if (chars[i]==' ' || i==original.length()-1){

                if (!temp.isEmpty()) {
                    reversed += reverse(temp);
                    temp = "";
                }
            }

            if (chars[i] == ' ') {
                reversed += " ";
            }
        }


        return reversed.trim();
    }


    public static String reverse(String word){

        String reversed="";
        for (int i = word.length()-1; i >= 0; i--) {

            reversed+=word.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {


        System.out.println(reverseWords("This is an example!"));
        System.out.println(reverseWords("this book"));
        System.out.println(reverseWords("double  spaces"));

    }


}

/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"

 */