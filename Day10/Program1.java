public class Program1{
    // static int[] id = new int[100];
    // static String[] name = new String[100];
    // static String[] email = new String[100];
    // static String[] password = new String[100];
    public static void main(String[] args) {
        //variable declaration
        // int number = 10;
        Person person = new Person(1, "Alex", "alex@gamil.com", "password");//object instance
        System.out.printf("%d %s %s %s\n", person.id, person.name, person.email, person.password);
    }

    static void test(int num1, int num2){

    }

}

class Person{
    int id;
    String name;
    String email;
    String password;

    Person(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

}