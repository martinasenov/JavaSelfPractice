package week13_AlgoQuestions;

public class Circle extends Shape {

    public final static double PI = 3.14;
    private double radius;


    public Circle(String nameOfProperty,double radius) {
        super(nameOfProperty);
        setRadius(radius);
    }



    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {

        if(radius<=0){
            throw new RuntimeException("Radius can not be zero or negative");
        }
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return radius * radius * PI;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
