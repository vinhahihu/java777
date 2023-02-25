package BaiTapLab3;

public class NhanVien {
    
    private String tenNhanVien;
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    
    private Double luongcoBan;
    public Double getLuongcoBan() {
        return luongcoBan;
    }
    public void setLuongcoBan(Double luongcoBan) {
        this.luongcoBan = luongcoBan;
    }

    private Double hesoLuong;
    public Double getHesoLuong() {
        return hesoLuong;
    }
    public void setHesoLuong(Double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    private Double Luong_MAX;
    public Double getLuong_MAX() {
        return Luong_MAX;
    }
    public void setLuong_MAX(Double luong_MAX) {
        this.Luong_MAX = luong_MAX;
    }

    public NhanVien(String name, Double luongcoBan, Double hesoLuong, Double Luong_MAX){
        this.tenNhanVien = name;
        this.luongcoBan = luongcoBan;
        this.hesoLuong = hesoLuong;
        this.Luong_MAX = Luong_MAX;
    }

    
    public NhanVien() {
        this.tenNhanVien = "Van Dinh";
        this.luongcoBan = 5.000;
        this.hesoLuong = 2.0;
        this.Luong_MAX = 7.000;
    }
    
    public Double tinhluong() {
        if(luongcoBan<= 0){
            System.out.println("Khong hop le!");
            System.out.println(this.luongcoBan);
            
        }
        return this.luongcoBan * this.hesoLuong;
    }
    public void inTTin(){
        System.out.println(this.tenNhanVien);
        System.out.println(this.luongcoBan);
        System.out.println(this.hesoLuong);
        System.out.println(this.Luong_MAX);
    }
    @Override
    public String toString() {
        return "NhanVien{ " + "tenNhanVien: " + tenNhanVien + ", luongcoBan= " + luongcoBan + ", hesoLuong= " + hesoLuong + ", Luong_MAX= " + Luong_MAX + '}';
    }

    

}