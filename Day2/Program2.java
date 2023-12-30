public class Program2 {
    public static void main(String[] args){
        Test tst = new Test();
        Person person = new Person();
        System.out.println("Hello Java");
        tst.hello();
        person.getName();
    }
}

class Test {
    public void hello(){
        System.out.println("Hello Method");
    }
}

class Person {
    public void getName(){
        System.out.println("My name is Alex");
    }
}