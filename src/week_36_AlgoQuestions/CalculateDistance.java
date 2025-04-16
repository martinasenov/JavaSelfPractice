package week_36_AlgoQuestions;

public class CalculateDistance {


    public static void main(String[] args) {

        System.out.println(calculateDistance(25, 4, 1, -6));
        System.out.println(calculateDistance(-47, 43, -25, -11));

        System.out.println();

        System.out.println(calculateDistance2(25, 4, 1, -6));
        System.out.println(calculateDistance2(-47, 43, -25, -11));



    }


    public static double calculateDistance(int x1, int y1, int x2, int y2){
        double a,b;

        if ((isNegative(y1) && isNegative(y2))   ||   (isPositive(y1) && isPositive(y2)) ){
            a=Math.abs(Math.abs(y1)-Math.abs(y2));
        } else {
            a=Math.abs(Math.abs(y1)+Math.abs(y2));
        }

        if ((isNegative(x1) && isNegative(x2))   ||   (isPositive(x1) && isPositive(x2)) ){
            b=Math.abs(Math.abs(x1)-Math.abs(x2));
        } else {
            b=Math.abs(Math.abs(x1)+Math.abs(x2));
        }

        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }


    public static boolean isNegative(int num){

        if (num<0){

            return true;
        }

        return false;
    }

    public static boolean isPositive(int num){

        if (num>0){

            return true;
        }

        return false;
    }





    public static double calculateDistance2(int x1, int y1, int x2, int y2){

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }





}



























