package QuanLyBoPhim;

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	HangSanXuat HangSanXuat;
	private double giaVe;
	Ngay ngayChieu;
	
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return HangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		HangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public Ngay getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(Ngay ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public BoPhim(String tenPhim, int namSanXuat, QuanLyBoPhim.HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu) {
		super();
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		HangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public boolean ktraGiaVeReHon(BoPhim phimKhac) {
		return this.giaVe < phimKhac.giaVe;
	}
	public String layTenHSX() {
		return this.HangSanXuat.getTenHangSanXuat();
	}
	public double giaSauKhuyenMai(double x) {
		return this.giaVe * (1 - x/100);
	}
	
	
	
}
