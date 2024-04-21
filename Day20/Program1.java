public class Program1 {
    //methods and fields

    //method call
    //static to static (directly)
    //static to instance (indirectly)
    //instance to instance (directly)
    //intance to static (directly)
    public static void main(String[] args) {
        //Methods
        //return type, parameter passing
        //static method and instance method
        // test1();

        //field
        //instance field and static field
        
        //instantiate
        Program1 p = new Program1();
        p.test2();

    }

    //static method
    static void test1(){
        System.out.println("This is static method");
    }

    //instance method
    void test2(){
        System.out.println("This is instance method");
    }

}
