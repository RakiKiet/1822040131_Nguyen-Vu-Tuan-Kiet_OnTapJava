import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Nhap gia tri a: ");
        a = sc.nextInt();

        String ketQua = (a % 2 == 0)?"so chan":"so le";
        System.out.println("a la " + ketQua);
    }
}
