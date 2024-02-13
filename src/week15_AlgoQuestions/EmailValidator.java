package week15_AlgoQuestions;

import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {

        String [] emails={"test@cydeo.com",
                          "test@cydeo.co.uk",
                          "mike.smith@cydeo.com",
                          "mike.smith@com",
                          "@cydeo.com",
                          "test@.com",
                          "test@cydeo.",
                          "test@@cydeo.com"
        };

        for (int i = 0; i < emails.length; i++) {

            System.out.print("email: "+emails[i]+"---->");
            emailValidator(emails[i]);
        }

    }


    public static void emailValidator(String email){

        boolean charChecker = email.contains("@") && email.contains(".");
        boolean charBeforeAt = !email.startsWith("@");
        boolean checkDotAfterAt = !(email.substring(email.lastIndexOf("@")).charAt(1) + "").contains(".");
        boolean checkDotInTheEnd = !email.endsWith(".");
        boolean checkTheDotExistence=email.substring(email.lastIndexOf("@")).contains(".");
        boolean atPositionChecker=email.indexOf("@") == email.lastIndexOf("@");

        boolean result = false;

        if (charChecker && charBeforeAt && checkDotAfterAt && checkDotInTheEnd && checkTheDotExistence && atPositionChecker) {
            result = true;
        }

        System.out.println(result);


    }
}


