package week13_AlgoQuestions;

public class Square extends Shape {

    private double side;


    public Square(String nameOfProperty, double side) {
        super(nameOfProperty);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Side can not be zero or negative");
        }

        this.side = side;
    }

    @Override
    public double calcArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
