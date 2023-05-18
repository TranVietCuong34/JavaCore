package QuanLyMayTinh;


public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Ngay ngay;
	private double giaBan;
	private double thoiGianBaoHanh;
	public MayTinh(HangSanXuat hangSanXuat, Ngay ngay, double giaBan, double thoiGianBaoHanh) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.ngay = ngay;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public Ngay getNgay() {
		return ngay;
	}
	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public boolean ktraGiaThapHon(MayTinh mtKhac) {
		return this.giaBan < mtKhac.giaBan;
	}
	public String layTenQG() {
		return this.hangSanXuat.layTenQuocGia();
	}
	
}
