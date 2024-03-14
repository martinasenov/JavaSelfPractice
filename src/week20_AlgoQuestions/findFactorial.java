package week20_AlgoQuestions;

public class findFactorial {

    public static void main(String[] args) {

        System.out.println(findFactorial(6));

    }


    public static int findFactorial(int number){

        for (int i = number-1; i >=1 ; i--) {
            number*=i;
        }
        return number;
    }
}
