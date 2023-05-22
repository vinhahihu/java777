package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static DanhSachPhongHoc listPH = new DanhSachPhongHoc();
	public static void main(String[] args) throws Exception {
		System.out.println("*** CHƯƠNG TRÌNH NHẬP XUẤT VÀ XỬ LÝ THÔNG TIN PHÒNG HỌC ***");
		
		nhapCung();
		
		int chon = -1;
		do
		{
			chon = menu();
			switch (chon)
			{
			case 1:				
				try {
					nhapDuLieu();
					System.out.println("Thêm phòng học thành công!");
					xuatDanhSach(listPH.getAllPH());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				xuatDanhSach(listPH.getAllPH());
				break;
			case 3:
				System.out.println("Danh sách các phòng học đạt chuẩn:");
				xuatDanhSach(listPH.timPHDatChuan());
				break;
			case 4:
				xuatDSTheoSoMayTinh();
				break;
			case 5:
				listPH.sapXepDayNha();
				xuatDanhSach(listPH.getAllPH());
				break;
			case 6:
				listPH.sapXepDienTichGiamDan();
				xuatDanhSach(listPH.getAllPH());
				break;
			case 7:
				listPH.sapXepBongDenTangDan();
				xuatDanhSach(listPH.getAllPH());
				break;
			case 8:
				System.out.println("Tổng số phòng học hiện có là: "+listPH.tongPhongHoc());
				break;
			case 9:
				System.out.println("Tổng số phòng học lý thuyết hiện có là: "+listPH.tongPhongHocLT());
				break;
			case 10:
				System.out.println("Tổng số phòng học máy tính hiện có là: "+listPH.tongPhongHocMT());
				break;
			case 11:
				System.out.println("Tổng số phòng học thí nghiệm hiện có là: "+listPH.tongPhongHocTN());
				break;
			case 12:
				timKiemPH();
				break;
			case 13:
				xoaPH();
				break;
			case 14:
				capNhatSoMayTinh();
				break;
			}
		}while(chon != 0);
		System.out.println("*** XIN CÁM ƠN !!! ***");
	}
	
	public static int menu()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.println("");
		System.out.println("###################### MENU #####################");
		System.out.println("##                                             ##");
		System.out.println("## 1.  Thêm phòng học                          ##");
		System.out.println("## 2.  In thông tin tất cả phòng học           ##");
		System.out.println("## 3.  In thông tin tất cả phòng học đạt chuẩn ##");
		System.out.println("## 4.  In thông tin phòng học có n máy tính    ##");
		System.out.println("## 5.  Sắp xếp theo dãy nhà tăng dần           ##");
		System.out.println("## 6.  Sắp xếp theo diện tích giảm dần         ##");
		System.out.println("## 7.  Sắp xếp theo số bóng đèn tăng dần       ##");
		System.out.println("## 8.  Tổng số phòng học                       ##");
		System.out.println("## 9.  Tổng số phòng học lý thuyết             ##");
		System.out.println("## 10. Tổng số phòng học máy tính              ##");
		System.out.println("## 11. Tổng số phòng học thí nghiệm            ##");
		System.out.println("## 12. Tìm kiếm phòng học                      ##");
		System.out.println("## 13. Xóa phòng học                           ##");
		System.out.println("## 14. Cập nhật số máy tính                    ##");
		System.out.println("## 0.  Kết thúc                                ##");
		System.out.println("##                                             ##");
		System.out.println("#################################################");
		System.out.println("Nhập chọn các chức năng bằng số:");
		int chon = nhap.nextInt();
		return chon;
	}
	
	public static void nhapCung() throws Exception
	{
		PhongHoc ph1 = new LyThuyet("PH001", "Dãy A", 150, 10, true);
		listPH.themPhongHoc(ph1);
		PhongHoc ph2 = new LyThuyet("PH002", "Dãy A", 200, 20, true);
		listPH.themPhongHoc(ph2);
		PhongHoc ph3 = new LyThuyet("PH003", "Dãy B", 150, 17, false);
		listPH.themPhongHoc(ph3);
		PhongHoc ph4 = new LyThuyet("PH004", "Dãy C", 200, 25, true);
		listPH.themPhongHoc(ph4);
		
		PhongHoc ph5 = new MayTinh("PH005", "Dãy B", 50, 10, 34);
		listPH.themPhongHoc(ph5);
		PhongHoc ph6 = new MayTinh("PH006", "Dãy B", 100, 10, 70);
		listPH.themPhongHoc(ph6);
		PhongHoc ph7 = new MayTinh("PH007", "Dãy C", 100, 10, 30);
		listPH.themPhongHoc(ph7);
		PhongHoc ph8 = new MayTinh("PH008", "Dãy C", 50, 10, 35);
		listPH.themPhongHoc(ph8);
		
		PhongHoc ph9 = new ThiNghiem("PH009", "Dãy D", 200, 20, 150, true);
		listPH.themPhongHoc(ph9);
		PhongHoc ph10 = new ThiNghiem("PH010", "Dãy D", 200, 20, 150, false);
		listPH.themPhongHoc(ph10);
		PhongHoc ph11 = new ThiNghiem("PH011", "Dãy D", 200, 20, 150, true);
		listPH.themPhongHoc(ph11);
		PhongHoc ph12 = new ThiNghiem("PH012", "Dãy D", 200, 15, 150, true);
		listPH.themPhongHoc(ph12);
	}
	
	public static void nhapDuLieu() throws Exception
	{
		String maPhong, dayNha;
		int soBongDen, soMayTinh, sucChua, loaiPH, chon;
		double dienTich;
		boolean mayChieu, bonRua;
		
		PhongHoc ph1 = new LyThuyet();
		PhongHoc ph2 = new MayTinh();
		PhongHoc ph3 = new ThiNghiem();
		
		Scanner nhap = new Scanner(System.in);
		
		try {
			System.out.println("Nhập mã phòng học:");
			maPhong = nhap.nextLine();
			if(listPH.timPH(maPhong)==null)
			{
				System.out.println("Nhập dãy nhà:");
				dayNha = nhap.nextLine();
				System.out.println("Nhập diện tích:");
				dienTich = nhap.nextDouble();
				System.out.println("Nhập số bóng đèn:");
				soBongDen = nhap.nextInt();
				System.out.println("Chọn loại phòng học:");
				System.out.println("	1.  Phòng lý thuyết");
				System.out.println("	2.  Phòng máy tính");
				System.out.println("	3.  Phòng thí nghiệm");
				loaiPH = nhap.nextInt();
				switch (loaiPH)
				{
				case 1:
					System.out.println("Phòng có trang bị máy chiếu không?");
					System.out.println("	1.  Có");
					System.out.println("	2.  Không");
					chon = nhap.nextInt();
					if(chon == 1)
						mayChieu = true;
					else
						mayChieu = false;
					try {
						ph1.setMaPhong(maPhong);
						ph1.setDayNha(dayNha);
						ph1.setDienTich(dienTich);
						ph1.setSoBongDen(soBongDen);
					} catch (Exception e) {
						throw new Exception(e.getMessage());
					}
					ph1 = new LyThuyet(maPhong, dayNha, dienTich, soBongDen, mayChieu);
					listPH.themPhongHoc(ph1);
					break;
				case 2:
					System.out.println("Nhập số máy tính:");
					soMayTinh = nhap.nextInt();
					try {
						ph2.setMaPhong(maPhong);
						ph2.setDayNha(dayNha);
						ph2.setDienTich(dienTich);
						ph2.setSoBongDen(soBongDen);
					} catch (Exception e) {
						throw new Exception(e.getMessage());
					}
					ph2 = new MayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
					listPH.themPhongHoc(ph2);
					break;
				case 3:
					System.out.println("Nhập sức chứa:");
					sucChua = nhap.nextInt();
					System.out.println("Phòng có bồn rửa không?");
					System.out.println("	1.  Có");
					System.out.println("	2.  Không");
					chon = nhap.nextInt();
					if(chon == 1)
						bonRua = true;
					else
						bonRua = false;
					try {
						ph3.setMaPhong(maPhong);
						ph3.setDayNha(dayNha);
						ph3.setDienTich(dienTich);
						ph3.setSoBongDen(soBongDen);
					} catch (Exception e) {
						throw new Exception(e.getMessage());
					}
					ph3 = new ThiNghiem(maPhong, dayNha, dienTich, soBongDen, sucChua, bonRua);
					listPH.themPhongHoc(ph3);
					break;
				}
			}
			else
				throw new Exception("Mã phòng học đã tồn tại!");
		} catch (Exception e) {
			System.out.println("Lỗi: "+e.getMessage());
			throw new Exception("Thêm không thành công!");
		}
	}
	
	public static void xuatTieuDePhongLT()
	{
		inGachNgang1();
		System.out.printf("|%-15s|%-10s|%-15s|%-15s|%-15s|%-15s|\n", "Mã phòng học", "Dãy nhà", "Diện tích(m^2)", "Số bóng đèn", "Máy chiếu", "Đánh giá");
		inGachNgang1();
	}
	
	public static void xuatTieuDePhongMT()
	{
		inGachNgang1();
		System.out.printf("|%-15s|%-10s|%-15s|%-15s|%-15s|%-15s|\n", "Mã phòng học", "Dãy nhà", "Diện tích(m^2)", "Số bóng đèn", "Số máy tính", "Đánh giá");
		inGachNgang1();
	}
	
	public static void xuatTieuDePhongTN()
	{
		inGachNgang2();
		System.out.printf("|%-15s|%-10s|%-15s|%-15s|%-15s|%-15s|%-15s|\n", "Mã phòng học", "Dãy nhà", "Diện tích(m^2)", "Số bóng đèn", "Sức chứa", "Bồn rửa", "Đánh giá");
		inGachNgang2();
	}
	
	public static void inGachNgang1()
	{
		for(int i = 0; i < 92; i++)
		{
			System.out.print("-");
		}
		System.out.print("\n");
	}
	
	public static void inGachNgang2()
	{
		for(int i = 0; i < 108; i++)
		{
			System.out.print("-");
		}
		System.out.print("\n");
	}
	
	public static void xuatDanhSach(ArrayList<PhongHoc> list)
	{
		System.out.println("Danh sách tất cả các phòng học:");
		System.out.println("Phòng lý thuyết:");
		xuatTieuDePhongLT();
		for (PhongHoc ph : list) 
		{
			if(ph instanceof LyThuyet)
			{
				System.out.println(ph);
				inGachNgang1();
			}
		}
		
		System.out.println("Phòng máy tính:");
		xuatTieuDePhongMT();
		for (PhongHoc ph : list) 
		{
			if(ph instanceof MayTinh)
			{
				System.out.println(ph);
				inGachNgang1();
			}
		}
		
		System.out.println("Phòng thí nghiệm:");
		xuatTieuDePhongTN();
		for (PhongHoc ph : list) 
		{
			if(ph instanceof ThiNghiem)
			{
				System.out.println(ph);
				inGachNgang2();
			}
		}
	}
	
	public static void timKiemPH()
	{
		Scanner nhap = new Scanner(System.in);
		String ma;
		System.out.println("Nhập mã phòng học cần tìm:");
		ma = nhap.nextLine();
		PhongHoc phTim = listPH.timPH(ma);
		if(phTim==null)
			System.out.println("Mã phòng học không tồn tại!");
		else
		{
			if(phTim instanceof LyThuyet)
			{
				xuatTieuDePhongLT();
				System.out.println(phTim);
				inGachNgang1();
			}
			else if(phTim instanceof MayTinh)
			{
				xuatTieuDePhongMT();
				System.out.println(phTim);
				inGachNgang1();
			}
			else
			{
				xuatTieuDePhongTN();
				System.out.println(phTim);
				inGachNgang2();
			}
		}
	}
	
	public static void xoaPH() 
	{
		int chon;
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập mã phòng học cần xóa:");
		String ma = nhap.nextLine();
		PhongHoc phXoa = listPH.timPH(ma);
		if(phXoa!=null)
		{
			System.out.println("Bạn có chắc chắn muốn xóa?");
			System.out.println("	1.  Có");
			System.out.println("	2.  Không");
			chon = nhap.nextInt();
			if(chon == 1)
			{
				listPH.xoaPH(phXoa);
				System.out.println("Xóa thành công!");
				System.out.println("Danh Sách phòng học sau khi xóa:");
				xuatDanhSach(listPH.getAllPH());
			}
			else
				System.out.println("Bạn đã hủy thao tác xóa!");
		}
		else
			System.out.println("Mã phòng học không tồn tại!");
	}
	
	public static void capNhatSoMayTinh() throws Exception
	{
		String ma;
		int soMay;
		
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập mã phòng học cần cập nhật:");
		ma = nhap.nextLine();
		PhongHoc phTim = listPH.timPH(ma);
		if(phTim==null)
			System.out.println("Mã phòng học không tồn tại!");
		else if(phTim instanceof MayTinh)
		{
			System.out.println("Thông tin phòng học trước khi cập nhật:");
			xuatTieuDePhongMT();
			System.out.println(phTim);
			inGachNgang1();
			System.out.println("Nhập số lượng máy tính:");
			soMay = nhap.nextInt();
			((MayTinh) phTim).setSoMayTinh(soMay);
			System.out.println("Cập nhật thành công!");
			System.out.println("Thông tin phòng học sau khi đã cập nhật:");
			xuatTieuDePhongMT();
			System.out.println(phTim);
			inGachNgang1();
		}
		else
			System.out.println("Không phải mã phòng máy tính!");
	}
	
	public static void xuatDSTheoSoMayTinh()
	{
		int soMay;
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhập số lượng máy tính:");
		soMay = nhap.nextInt();
		ArrayList<PhongHoc> list = listPH.timPHTheoSoMayTinh(soMay);
		System.out.println("Danh sách các phòng máy tính có số máy từ "+soMay+" trở lên:");
		xuatTieuDePhongMT();
		for (PhongHoc ph : list) {
			{
				System.out.println(ph);
				inGachNgang1();
			}
		}
	}
}

