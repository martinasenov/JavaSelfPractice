package replitTasks.String;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE


        if(word.length() > 0 && word.startsWith("X") || word.startsWith("x")){

            word=word.substring(1);

        }

        if(word.length() > 0 && word.endsWith("X") || word.endsWith("x")){

            word = word.substring(0, word.length() - 1);
        }


        System.out.println(word);

        boolean result=false;

        if(word.substring(0).startsWith("java") || word.substring(1).startsWith("java")){

            result=true;
        }

        System.out.println(result);


    }

    }