package creationalDesignPatterns.prototypePattern;

public class PrototypeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setId("1");
        Circle clonedCircle = (Circle) circle.clone();
        System.out.println("Cloned Shape: " + clonedCircle.getType());

        Square square = new Square();
        square.setId("2");
        Square clonedSquare = (Square) square.clone();
        System.out.println("Cloned Shape: " + clonedSquare.getType());
    }
}
