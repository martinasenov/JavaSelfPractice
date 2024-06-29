package week_30_AlgoQuestions;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    // Method to add integers to a list of numbers
    public static void addIntegers(List<? super Integer> list) {
        list.add(1); // Valid: adding Integer
        list.add(2); // Valid: adding Integer
        // list.add(1.5); // Invalid: cannot add Double
        // list.add(new Object()); // Invalid: cannot add Object
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();


        addIntegers(intList); // Valid
        addIntegers(numberList); // Valid
        addIntegers(objectList); // Valid

        System.out.println("Integer list: " + intList); // Outputs: [1, 2]
        System.out.println("Number list: " + numberList); // Outputs: [1, 2]
        System.out.println("Object list: " + objectList); // Outputs: [1, 2]
    }
}
