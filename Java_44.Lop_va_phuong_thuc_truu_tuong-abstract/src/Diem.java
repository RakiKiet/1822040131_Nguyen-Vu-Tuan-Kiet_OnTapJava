//Lớp và phương thức trừu tượng abstract trong Java
public class Diem extends Hinh {
    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    public double tinhDienTich() {
        return 1;
    }
}