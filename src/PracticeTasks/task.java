package PracticeTasks;

public class task {


    /*
       If the number is greater than 90, I want to print only "Number is greater than 90"
       But it prints "Number is greater than 50" after "Number is greater than 90" for numbers greater than 90.
        */
    public static void main(String[] args) {




        int number = 95;
        if (number > 90) {
            System.out.println(number + " is greater than 90");
        }
        else if (number > 50) {
            System.out.println(number + " is greater than 50");
        }



    /*    If the grade is greater than or equals to 90 output excellent
        If the grade is greater than or equals to 70 and smaller than 90 output good
        If the grade is greater than or equals to 60 and smaller than 70 output pass
        If the grade is smaller than 60 output fail

        What is wrong here?
        What could be improved?*/


        int grade = 90;
        if (grade <= 100 && grade >= 90) {
            System.out.println("excellent");
        } else if (grade <= 90 && grade >= 70) {
            System.out.println("good");
        } else if (grade <= 70 && grade >= 60) {
            System.out.println("pass");
        } else if (grade <= 60 && grade >= 50) {
            System.out.println("fail");
        }
    }
}
