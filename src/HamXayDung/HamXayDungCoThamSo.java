package HamXayDung;

public class HamXayDungCoThamSo {

    public String name;
    public String phone;

    public HamXayDungCoThamSo(String name, String phone1) {
        this.name = name; //Dùng this -> Khi trùng tên biến ngoài và trong class
        phone = phone1;
    }

    public static void main(String[] args) {

        //Khởi tạo đối tượng class là nó đã chạy cái hàm xây dựng
        HamXayDungCoThamSo hamXayDungCoThamSo = new HamXayDungCoThamSo("Phương","12345");

        System.out.println(hamXayDungCoThamSo.name);
        System.out.println(hamXayDungCoThamSo.phone);

        //Khởi tạo đối tượng class là nó đã chạy cái hàm xây dựng
        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Hoàng","67891");

        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);
    }
}
