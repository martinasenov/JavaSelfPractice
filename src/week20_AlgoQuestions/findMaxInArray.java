package week20_AlgoQuestions;

public class findMaxInArray {

    public static void main(String[] args) {



        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(max(array));


    }




    public static Integer max (int [] array){

        if (array.equals(null)){
            return null;
        }

        if (array.length==0){
            throw new IllegalArgumentException("Array is empty");
        }

        int max=array[0];

        for (int i = 0; i < array.length; i++) {

            if (max<array[i]){

                max=array[i];
            }

        }
        return max;

    }
}
/*
Question-1 Find Max from int Array
Write a function that can find the maximum number from an int Array.
input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */