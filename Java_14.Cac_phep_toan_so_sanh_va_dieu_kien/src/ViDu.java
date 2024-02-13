//Các phép toán so sánh và điều kiện trong Java
import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập giá trị a: ");
        a = sc.nextInt();
        System.out.print("Nhập giá trị b: ");
        b = sc.nextInt();

        //Xuất kết quả so sánh
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println("------------");
        System.out.println("Cả hai giá trị là số chẵn: " + (a % 2 == 0 && b % 2 == 0));
        System.out.println("Một trong hai giá trị là số chẵn: " + (a % 2 == 0 || b % 2 == 0));
    }
}
