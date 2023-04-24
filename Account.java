package Lab1N2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Account {
    private Long sTK;
    private int tenTK;
    private double sotienTrongTK;
    private String trangThai;
 
    Scanner sc = new Scanner(System.in);
    public Account() {
 
    }
   
    public Account(Long sTK, int tenTK,double sotienTrongTK,String trangThai) {
        this.sTK = sTK;
        this.tenTK = tenTK;
        this.sotienTrongTK = sotienTrongTK;
        this.trangThai = trangThai;
    }
    public Long getsTK() {
        return sTK;
    }
 
    public void setsTK(Long sTK) {
        this.sTK = sTK;
    }
 
    public int gettenTK() {
        return tenTK;
    }
 
    public void settenTK(int tenTK) {
        this.tenTK = tenTK;
    }
 
    public double getsotienTrongTK() {
        return sotienTrongTK;
    }
 
    public void setsotienTrongTK(double sotienTrongTK) {
        this.sotienTrongTK = sotienTrongTK;
    }
 
    public String gettrangThai() {
        return  trangThai;
    }
 
    public void settrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotienTrongTK);
        new Locale("vi", "vn");
        return sTK + "-" + tenTK + "-" + str1;
    }
    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            sotienTrongTK = nap + sotienTrongTK;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        if (rut <= (sotienTrongTK - phi)) {
            sotienTrongTK = sotienTrongTK - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
        public double daoHan() {
            double laiSuat = 0.035;
            sotienTrongTK = sotienTrongTK + sotienTrongTK * laiSuat;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(sotienTrongTK);
            System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
            return sotienTrongTK;
        }
        void inTK() {
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(sotienTrongTK);
            System.out.printf("%-10d %-20s %-20s \n", sTK, tenTK, str1);
        }
  
       
    }

