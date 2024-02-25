//Khái niệm về kế thừa trong Java
public class HocSinh extends ConNguoi {
    private String tenLop;
    private String tenTruong;

    public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public String getTenTruong() {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public void lamBaiTap() {
        System.out.println("Bài tập cần làm!");
    }
}
