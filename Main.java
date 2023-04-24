package Lab1N2;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static void nhapTK(Account tk) 
    {
        
        System.out.println("Nhap So Tai Khoan: ");
        tk.setsTK(sc.nextLong());
        sc.nextLine();
        System.out.println("Nhap Ten Tai Khoan: ");
        tk.settenTK(sc.nextInt());
        tk.setsotienTrongTK(50);
    }
    public static void main(String[] args) 
    {
        Account a[] = null;
        int n = 0;
        int chon;
        long s, d, c, f;
        
        do 
        {
            System.out.println("Menu: ");
            System.out.println("1.Nhap Thong Tin\n"
                             + "2.Xuat Danh Sach Thong Tin\n" + "3.Nap Tien\n" + "4.Rut Tien\n"
                             + "5.Chuyen Tien\n"+"6.Đáo Hạn\n" + "Nhan Phim 0 De Exit!");
            chon = sc.nextInt();
            switch (chon) 
            {
                case 1:
                {
                    System.out.println("Nhap So Luong Muon Nhap Thong Tin: ");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) 
                    {
                        System.out.println("Khach Hang Thu : " + (i+1));
                        a[i]=new Account();
                        nhapTK(a[i]);
                    }
                } break;
                case 2:
                {
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "So Tien Trong TK");
                    for (int i = 0; i < n; i++) 
                    {
                        a[i].inTK();
                    }
                } break;
                case 3:
                {
                    System.out.println("Nhap So Tai Khoan Can Nap: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) 
                    {
                        d = a[i].getsTK();
                        if (s == d) 
                        {
                            
                            a[i].napTien();
                        } 
                        else 
                        {
                            System.out.println("");
                        }
                    }
                } break;
                case 4:
                {
                    System.out.println("Nhap So Tai Khoan Can Rut: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) 
                    {
                        d = a[i].getsTK();
                        if (s == d) 
                        {
                            System.out.println("Chon Tai Khoan: " + d);
                            a[i].rutTien();
                        }
}
                } break;
                case 5:
                {
                    double chuyen, nhan, tienChuyen;
                    System.out.print("Nhap So Tai Khoan Chuyen Tien: ");
                    s = sc.nextLong();
                    System.out.print("Nhap So Tai Khoan Nhan Tien: ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) 
                    {
                        d = a[i].getsTK();
                        if (s == d) 
                        {
                            chuyen = a[i].getsotienTrongTK();
                            for (int j = 0; j < n; j++) 
                            {
                                f = a[j].getsTK();
                                if (c == f) 
                                {
                                    nhan = a[j].getsotienTrongTK();
                                    System.out.println("Nhap So Tien: ");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) 
                                    {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setsotienTrongTK(chuyen);
                                        a[j].setsotienTrongTK(nhan);
                                        System.out.println("Tai Khoan " + d + " Vua Chuyen: $" + tienChuyen);
                                        System.out.println("Tai Khoan " + f + " Vua Nhan: $" + tienChuyen);
                                    } 
                                    else 
                                    {
                                        System.out.println("So Tien Nhap Khong Hop Ly!");
                                    }
                                } 
                                else 
                                {
                                    System.out.println("");
                                }
                            }
                        } 
                        else 
                        {
                            System.out.println("");
                        }
                    }
                } break;
                case 6:
                {
                    System.out.println("Nhap So Tai Khoan: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) 
                    {
                        d = a[i].getsTK();
                        if (s == d) 
                        {
                            a[i].daoHan();
                        } 
                        else 
                        {
                            System.out.println("");
                        }
                    }
                } break;
            }
        } while (chon!=0);
    }
}