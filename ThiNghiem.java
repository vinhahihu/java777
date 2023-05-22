package java3;
public class ThiNghiem extends PhongHoc {
	private int sucChua;
	private boolean bonRua;
	
	@Override
	boolean xetDatChuan() {
		if(duAnhSang() && bonRua == true)
			return true;
		return false;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) throws Exception {
		if(sucChua > 50)
			this.sucChua = sucChua;
		else
			throw new Exception("Sức chứa không được bé hơn 50!");
	}

	public boolean isBonRua() {
		return bonRua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}

	public ThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, int sucChua, boolean bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}

	public ThiNghiem() {
		super();
	}

	public ThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super(maPhong, dayNha, dienTich, soBongDen);
	}
	

	@Override
	public String toString() {
		String danhGia, bonRua;
		if(xetDatChuan())
			danhGia = "Đạt chuẩn";
		else
			danhGia = "Không đạt chuẩn";
		
		if(this.bonRua)
			bonRua = "Có";
		else
			bonRua = "Không";
		
		return super.toString()+String.format("%15d"+"|"+"%-15s"+"|"+"%-15s"+"|", sucChua, bonRua, danhGia);
	}
}
