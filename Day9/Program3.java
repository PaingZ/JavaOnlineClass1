public class Program3{
    public static void main(String[] args) {
        String result = ret_str();

        System.out.println(result);
    }

    static int ret_int(){
        return 50;
    }

    static double ret_doub(){
        return 3.14;
    }

    static char ret_char(){
        return 'a';
    }

    static String ret_str(){
        System.out.println("this is ret_str method");
        return "Hello";
    }

}