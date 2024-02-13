package PracticeTasks;

public class Interview {

    public static void main(String[] args) {


        System.out.println(findGreaterNumber(5, 6));



        findGreaterNumbers(7,5);

    }



    public static void findGreaterNumbers(int secondNum,double firstNum){

        if (secondNum>firstNum){

            System.out.println(secondNum);

        }else {

            System.out.println(firstNum);
        }


    }


    public static double findGreaterNumber(double firstNum, double secondNum){

        if (secondNum>firstNum){

            return secondNum;
        }


        return firstNum;
    }



}
