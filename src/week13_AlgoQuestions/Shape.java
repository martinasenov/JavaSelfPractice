package week13_AlgoQuestions;

import java.security.PrivateKey;
import java.util.ArrayList;

public abstract class Shape {

    private String nameOfProperty;
    private double area;

    public Shape(String nameOfProperty) {
        setNameOfProperty(nameOfProperty);
    }


    public String getNameOfProperty() {
        return nameOfProperty;
    }

    public void setNameOfProperty(String nameOfProperty) {
        this.nameOfProperty = nameOfProperty;
    }

    public abstract double calcArea();


    public static void customerRequest(ArrayList<Shape> inventory, double minRequestedSquareMeters,String shape){

        System.out.println("\nThe Houses above "+minRequestedSquareMeters+" square meters:\n");

            for (Shape each : inventory) {

                if(each.calcArea()>minRequestedSquareMeters && each.getClass().getSimpleName().equalsIgnoreCase(shape)){

                    System.out.println(each);
                }
            }

        }








    @Override
    public String toString() {
        return getNameOfProperty()+ "{" +
                "Shape=" + getClass().getSimpleName()+", "+
                "Area=" + calcArea() +" m2"+
                '}';
    }
}
