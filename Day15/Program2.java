public class Program2{
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Black";
        car.brandName = "BMW";
        car.releasedYear = 2000;

        System.out.println(car.color);
        System.out.println(car.brandName);
        System.out.println(car.releasedYear);
    }
}

class Car{
    //fields
    String color;
    String brandName;
    int releasedYear;
    //methods
    void start(){
        System.out.println("Car is starting...");
    }

    void drive(){
        System.out.println("Car is driving...");
    }

    void stop(){
        System.out.println("Car stopped");
    }


}