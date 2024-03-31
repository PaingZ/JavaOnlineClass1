public class Program3 {
    public static void main(String[] args) {
        //Rererence Type
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");

        if(s1.equals(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
