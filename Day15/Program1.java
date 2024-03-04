public class Program1{
    public static void main(String[] args) {
        //Object create
        //object instantiate
        // int num1;//primitive type
        // Integer num2;//object type
        Car car1 = new Car(); //object instantiate
        car1.start();

        Car car2 = new Car();
        car2.drive();
    }
}

class Car{
    //fields //methods
    String color;
    String brandName;
    int releasedYear;

    //start, drive, stop
    // <data type> <method name>(<parameter>, ...){
        // return data type
    // }
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