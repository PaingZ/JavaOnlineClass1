public class Program4{
    public static void main(String[] args) {

        CarOne car = new CarOne("black", "BMW", 2000);

        System.out.println(car.color + car.brandName + car.releasedYear);


    }
}

class CarOne{
    //fields
    String color;
    String brandName;
    int releasedYear;
    //Constructor method
    //it work when object instantiate
    CarOne(String carColor, String carBrandName, int carReleasedYear){
//        System.out.println("This is constructor");
        this.color = carColor;
        this.brandName = carBrandName;
        this.releasedYear = carReleasedYear;
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