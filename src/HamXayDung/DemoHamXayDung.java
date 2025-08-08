package HamXayDung;

public class DemoHamXayDung {

   public String name;
   public String phone;

   //Hàm xây dựng - có tên hàm giống với tên class
   //KKhông có giá trị trả về
   public DemoHamXayDung() {
        name = "Phương";
        phone = "123456789";
    }

   public static void main(String[] args) {

        //Khởi tạo đối tượng class là nó đã chạy cái hàm xây dựng
       DemoHamXayDung demoHamXayDung = new DemoHamXayDung();

       System.out.println(demoHamXayDung.name);
       System.out.println(demoHamXayDung.phone);
   }
}
