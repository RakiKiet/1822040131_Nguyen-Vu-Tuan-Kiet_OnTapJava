//Các phép toán cơ bản trong Java
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        //Khai báo biến
        int a, b;
        //Nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        //Tính tổng
        int tong = a + b;
        System.out.println(a+" + "+b+" = "+tong);

        //Tính hiệu
        int hieu = a - b;
        System.out.println(a+" - "+b+" = "+hieu);

        //Tính tích
        int tich = a * b;
        System.out.println(a+" * "+b+" = "+tich);

        //Tính thương
        float thuong = (float)a / b;
        System.out.println(a+" / "+b+" = "+thuong);

        //Tính chia lấy dư
        int soDu = a % b;
        System.out.println(a+" % "+b+" = "+soDu);
    }
}
