//Cách nhập dữ liệu từ bàn phím
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào họ và tên: ");
        String hoVaTen = sc.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        long maSinhVien = sc.nextLong();

        System.out.print("Nhập điểm thi: ");
        float diemThi = sc.nextFloat();

        System.out.println("Họ và Tên: "+hoVaTen);
        System.out.println("Mã sinh viên: "+maSinhVien);
        System.out.println("Điểm thi: "+diemThi);
    }
}

