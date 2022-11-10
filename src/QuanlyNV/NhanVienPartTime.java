package QuanlyNV;

public class NhanVienPartTime extends NhanVien{
    private int soBuoi;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public NhanVienPartTime(String name, int age, String gender, int soBuoi) {
        super(name, age, gender);
        this.soBuoi = soBuoi;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }
    public double getSalary() {
        double luong = this.soBuoi*200000;
        System.out.println(String.format("%.2f",luong));
        return luong;
    }

    @Override
    public String toString() {
        return super.toString()+ "NhanVienPartTime{" +
                "soBuoi=" + soBuoi +
                '}';
    }
}
