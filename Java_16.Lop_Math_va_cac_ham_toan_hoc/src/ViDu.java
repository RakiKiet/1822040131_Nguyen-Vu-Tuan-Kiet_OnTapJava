//Lớp Math và các hàm toán học trong Java
import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        a = sc.nextDouble();
        System.out.print("Nhap gia tri b: ");
        b = sc.nextDouble();

        //Gia tri tuyet doi
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("|b| = " + Math.abs(b));
        System.out.println(""); //Hoac System.out.print("\n");
        //Gia tri min
        System.out.println("Gia tri nho nhat la: " + Math.min(a, b));
        //Gia tri max
        System.out.println("Gia tri lon nhat la: " + Math.max(a, b));
        //Gia tri ceil
        System.out.println("Ceil cua a la: " + Math.ceil(a));
        System.out.println("Ceil cua b la: " + Math.ceil(b));
        //Gia tri floor
        System.out.println("Floor cua a la: " + Math.floor(a));
        System.out.println("Floor cua b la: " + Math.floor(b));
        //Can bac hai
        System.out.println("Can bac hai cua a la: " + Math.sqrt(a));
        System.out.println("Can bac hai cua b la: " + Math.sqrt(b));
        //Mu
        System.out.println("a mu b bang " + Math.pow(a, b));
    }
}
