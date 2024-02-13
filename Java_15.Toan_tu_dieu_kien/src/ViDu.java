//Toán tử điều kiện trong Java
import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhập giá trị a: ");
        a = sc.nextInt();

        String ketQua = (a % 2 == 0)?"số chẵn":"số lẻ";
        System.out.println("a là " + ketQua);
    }
}
