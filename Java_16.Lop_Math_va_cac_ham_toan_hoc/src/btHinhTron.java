import java.util.Scanner;
public class btHinhTron {
    public static void main(String[] args) {
        //Cong thuc tinh ChuViHinhTron: 2*PI*R
        //Cong thuc tinh DienTichHinhTron: PI*R^2
        double r;
        double chuVi, dienTich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri ban kinh r: ");
        r = sc.nextDouble();

        chuVi = 2 * Math.PI * r;
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi hinh tron la: " + chuVi);
        System.out.println("Lam tron chu vi: " + Math.round(chuVi));
        System.out.println("Dien tich hinh tron la: " + dienTich);
        System.out.println("Lam tron dien tich: " + Math.round(dienTich));
    }
}
