//Bài tập quản lý sinh viên trong Java
public class Ngay {
    private int Ngay;
    private int Thang;
    private int Nam;

    public Ngay(int ngay, int thang, int nam)
    {
        if(ngay >= 1 && ngay <= 31) {
            Ngay = ngay;
        }
        else {
            Ngay = 1;
        }
        if(thang >= 1 && thang <= 12) {
            Thang = thang;
        }
        else {
            Thang = 1;
        }
        if(nam >= 0) {
            Nam = nam;
        }
        else {
            Nam = 1;
        }
    }
    public int getNgay(){
        return Ngay;
    }
    public void setNgay(int ngay){
        if(ngay >= 1 && ngay <= 31) {
            Ngay = ngay;
        }
    }
    public int getThang() {
        return Thang;
    }
    public void setThang(int thang) {
        if(thang >= 1 && thang <= 12) {
            Thang = thang;
        }
    }
    public int getNam() {
        return Nam;
    }
    public void setNam(int nam){
        if(nam >= 0) {
            Nam = nam;
        }
    }
    @Override
    public String toString() {
        return Ngay + "/" + Thang + "/" + Nam;
    }
    public boolean equals(Object obj)
    {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        Ngay other = (Ngay)obj;
        if(this.Ngay != other.Ngay) {
            return false;
        }
        if(this.Thang != other.Thang) {
            return false;
        }
        if(this.Nam != other.Nam) {
            return false;
        }
        return true;
    }
}