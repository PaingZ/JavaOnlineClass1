public class Student {
    private String name;
    private int age;

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    public void setData(String sName, int sAge){
//        name = sName;
//        age = sAge;
//    }
//
//    public String getName(){
//        return name;
//    }

    public void introduce(){
        System.out.println("I'm " + name);
        System.out.println("I'm " + age +  " years old");
    }
}
