package java3;

public class MayTinh extends PhongHoc {
	private int soMayTinh;
	
	@Override
	boolean xetDatChuan() {
		if(duAnhSang() && dienTich/soMayTinh <= 1.5)
			return true;
		return false;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) throws Exception {
		if(soMayTinh > 0)
			this.soMayTinh = soMayTinh;
		else
			throw new Exception("Số máy tính phải lớn hơn 0!");
	}

	public MayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public MayTinh() {
		super();
	}

	public MayTinh(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
	}

	@Override
	public String toString() {
		String danhGia;
		if(xetDatChuan())
			danhGia = "Đạt chuẩn";
		else
			danhGia = "Không đạt chuẩn";
		
		return super.toString()+String.format("%15d"+"|"+"%-15s"+"|", soMayTinh, danhGia);
	}
}
