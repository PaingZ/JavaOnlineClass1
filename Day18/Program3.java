public class Program3 {
    //fields -> variable
    //instance field and static field
    //methods -> static methods

    static int number;//field

    public static void main(String[] args) {
        int a = 10;//method variable
        number = 10;
        test();
    }

    static void test(){
        System.out.println("The number is " + number);
    }

}
