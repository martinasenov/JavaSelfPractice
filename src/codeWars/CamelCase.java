package codeWars;

import java.util.Arrays;
import java.util.Locale;

public class CamelCase {


    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior")); // "theStealthWarrior"
        System.out.println(toCamelCase("The_Stealth_Warrior")); // "TheStealthWarrior"
        System.out.println(toCamelCase("the_Stealth-Warrior")); // "theStealthWarrior"



        String str="the_Stealth-Warrior";
        String[] words = str.split("[-_]");

        str=Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);

        System.out.println(str);
    }

    public static String toCamelCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder converted = new StringBuilder();
        boolean nextUpperCase = false;

        for (char c : s.toCharArray()) {

            if (c == '-' || c == '_') {
                nextUpperCase = true;

            } else {


                if (nextUpperCase) {
                    converted.append(Character.toUpperCase(c));
                    nextUpperCase = false;
                } else {
                    converted.append(c);
                }


            }
        }

        return converted.toString();
    }
}





/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */