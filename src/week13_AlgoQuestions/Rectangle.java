package week13_AlgoQuestions;

public class Rectangle extends Shape{


    private double sideA, sideB;

    public Rectangle(String nameOfProperty, double sideA, double sideB) {
        super(nameOfProperty);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA<=0){
            throw new RuntimeException("Side can not be zero or negative");
        }

        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB<=0){
            throw new RuntimeException("Side can not be zero or negative");
        }
        this.sideB = sideB;
    }



    @Override
    public double calcArea() {

        return sideA*sideB;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
