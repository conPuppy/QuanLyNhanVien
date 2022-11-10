package QuanlyNV;

public class NhanVienFullTime extends NhanVien{
    private double heSo;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double heSo) {
        this.heSo = heSo;
    }

    public NhanVienFullTime(String name, int age, String gender, double heso) {
        super(name, age, gender);
        this.heSo = heso;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    public double getSalary() {
        double luong = this.heSo* 5000000;
        System.out.println(String.format("%.2f",luong));
        return luong;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVienFullTime{" +
                "heSo=" + heSo +
                '}';
    }
}
