package Javalthdt1;
 
public class SinhVienNhap {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;
 

    public SinhVienNhap() {
 
    }
   
    public SinhVienNhap(int maSV, String hoTen, String diaChi, String sTD) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }
    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
 
    public String getsTD() {
        return sTD;
    }
 
    public void setsTD(String sTD) {
        this.sTD = sTD;
    }
    @Override
    public String toString() {
        return "SinhVienNhap{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", sTD=" + sTD + '}';
    }
    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", maSV, hoTen, diaChi, sTD);
    }
}
