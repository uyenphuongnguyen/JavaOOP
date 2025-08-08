package TinhKeThua;

public class Person {

    // Hàm xây dựng
    public String name;
    public int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }

    // Hàm thường
    public static void sayHello() {
        System.out.println("Hello World");
    }

}
