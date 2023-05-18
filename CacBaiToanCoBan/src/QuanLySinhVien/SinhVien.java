package QuanLySinhVien;

public class SinhVien {
	private String maSV;
	private String hoVaTen;
	private	Ngay ngaySinh;
	private double diemTB;
	private Lop lop;
	public SinhVien(String maSV, String hoVaTen, Ngay ngay, double diemTB, Lop lop) {
		super();
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngay;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Ngay getNgay() {
		return ngaySinh;
	}
	public void setNgay(Ngay ngay) {
		this.ngaySinh = ngay;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}
	public boolean ktraThiDat() {
		return this.diemTB >= 5;
	}
	public boolean ktraCungNgaySinh(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.ngaySinh);
	}
	
}
