package TinhKeThua;

import HamXayDung.DemoHamXayDung;

public class Student extends Person {

    //Tính năng ghi đè
    private String phone;
    private String address;

    public Student(String name, int age, float height, String phone, String address) {
        super(name,age,height); //Hàm xây dựng có 3 tham số
        //Chỉ sử dụng super khi có hàm xây dựng
        //Hàm super dùng để truyền data ngược về cho class cha
        //super(name); //Hàm xây dựng có 1 tham số -> Chỉ in ra giá trị của tham số name

        this.address = address;
        this.phone = phone;
    }

    public void showInfoStudent() {
        super.getInfo(); //Kế thừa từ class Person nên không cần khai báo đối tượng class
        //Dùng từ khoá super để gọi các thành phần bị trùng ở class cha
        // Từ khoá super đại diện cho class cha

        getInfo();

        System.out.println("Phone:" + this.phone); //Từ class con
        System.out.println("Address:" + this.address); //Từ class con
    }

    //Ghi đè phương thức từ class cha (tên hàm ở class con giống tên hàm ở class cha)
    //Chạy hàm ở class con nếu bị trùng hàm với class cha
    public void getInfo() {

        System.out.println("Phone:" + this.phone); //Từ class con
        System.out.println("Address:" + this.address); //Từ class con
    }

    public static void main(String[] args) {
        sayHello();
        Student student = new Student("Phương",27,1.62F,"HCM","0912345678");
//        student.showInfoStudent();
        student.getInfo();
    }

}
