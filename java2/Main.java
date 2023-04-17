
package java2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
      static void nhapXe(Vehicle xe){
            System.out.print("Nhập mã xe: ");
            xe.setMaXe(sc.nextInt());sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());;sc.nextLine();
            System.out.print("Mô tả: ");
            xe.setMoTa(sc.nextLine());
        }
    public static void main(String[] args) {
        Vehicle v[]= null;
        int a,n=0;
        boolean flag = true;
        do{
            System.out.println("Bạn chọn làm gì!!!");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin \n"+
                    "2.Xuất bảng kê khai tiền thuế của các xe.\n"+
                    "Nhập số khác để thoát");
            a =sc.nextInt();
            switch (a){
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n=sc.nextInt();
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
                    for (int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag=false;
                    break;
            }
        }while (flag);
    }
}

