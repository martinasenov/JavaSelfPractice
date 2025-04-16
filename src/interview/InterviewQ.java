package interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InterviewQ {


    public static void main(String[] args) {

        int [] array = {0,1,2,3,4,5,6};

        swapElements2(array);

        System.out.println(Arrays.toString(array));
        swapElements(array,0,5);
    }



    public static void swapElements(int[] array,int pos1, int pos2){
        int temp;
        temp=array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=temp;
    }



    public static void swapElements2(int [] array){
        for (int i = 0,j= array.length-1; i < array.length/2; i++,j--) {
            swapElements(array, i, j);
        }

    }

}
