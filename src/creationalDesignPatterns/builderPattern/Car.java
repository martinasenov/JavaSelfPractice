package creationalDesignPatterns.builderPattern;

public class Car {

    private String engine;
    private int wheels;
    private boolean airbags;

    public static class Builder {

        private String engine;
        private int wheels;
        private boolean airbags;

        public Builder setEngine(String engine){
            this.engine=engine;
            return this;
        }

        public Builder setWheels(int wheels){
            this.wheels=wheels;
            return this;
        }

        public Builder setAirbags(boolean airbags){
            this.airbags=airbags;
            return this;
        }

        public Car build(){
            Car car=new Car();
            car.engine=this.engine;
            car.wheels=this.wheels;
            car.airbags=this.airbags;
            return car;
        }

    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", airbags=" + airbags + "]";
    }

    public static void main(String[] args) {
        Car car=new Car.Builder()
                .setEngine("V8")
                .setWheels(4)
                .setAirbags(true)
                .build();

        System.out.println(car);
    }
}
