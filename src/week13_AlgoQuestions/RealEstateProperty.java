package week13_AlgoQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealEstateProperty {

    public static void main(String[] args) {

        Square squareHouse1=new Square("Whispering Willows",20);
        Square squareHouse2=new Square("Twilight Grove",25);
        Square squareHouse3=new Square("Garden of Eden",35);

        Rectangle rectangleHouse1=new Rectangle("Cerulean Cove",35,45);
        Rectangle rectangleHouse2=new Rectangle("Eagle's Crest",20,30);
        Rectangle rectangleHouse3=new Rectangle("Orchard Oasis",15,20);


        Circle circleHouse1=new Circle("Sunset Haven",10);
        Circle circleHouse2=new Circle("Azure Retreat",15);
        Circle circleHouse3=new Circle("Harmony Manor",20);



        //customer request: Houses with area under 600 square meters will not be accepted...


        ArrayList<Shape>inventory = new ArrayList<>(Arrays.asList(squareHouse1,squareHouse2,squareHouse3,
                                                              rectangleHouse1,rectangleHouse2,rectangleHouse3,
                                                               circleHouse1,circleHouse2,circleHouse3));



        Shape.customerRequest(inventory,600,"circle");


    }

}
