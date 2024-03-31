public class Program2 {
    public static void main(String[] args) {

        //Reference Type
        String s1 = "Hello World";
        String s2 = s1;

        System.out.println("S1 : " + s1);
        System.out.println("S2 : " + s2);

        s1 = "Hi";

        System.out.println("S1 : " + s1);
        System.out.println("S2 : " + s2);

    }
}
