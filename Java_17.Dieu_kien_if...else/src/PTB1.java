//Câu lệnh điều kiện if... else trong Java
import java.util.Scanner;
public class PTB1 {
    public static void main(String[] args) {
        float a, b;
        float x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá tri a: ");
        a = sc.nextFloat();
        System.out.print("Nhập giá trị b: ");
        b = sc.nextFloat();
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else {
            x = (float)-b / a;
        }
        System.out.println("Phương trình có nghiệm x = " + x);
    }
}
