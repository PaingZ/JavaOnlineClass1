public class Program3{
    public static void main(String[] args) {
        Car car1 = new Car();//object instantiate

    }
}

class Car{
    //fields
    String color;
    String brandName;
    int releasedYear;
    //Constructor method
    //it work when object instantiate
    Car(){
        System.out.println("This is constructor");
    }
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