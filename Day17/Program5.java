public class Program5 {
    //<access modifier|optional> <modifier keyword|optional> <return type|data type> <method_name or identifier> <parameter> <method body>
    public static void main(String[] args) {
        // hello();
        // System.out.println("Java Program");
        // hello();

        banner("Java Programming");
    }

    //f(x) = x+2;
    //f(2) = 2+2 = 4

    //static method
    static void hello(){
        System.out.println("***************");
    }

    static void banner(String str){
        hello();
        System.out.println(str);
        hello();
    }

}
