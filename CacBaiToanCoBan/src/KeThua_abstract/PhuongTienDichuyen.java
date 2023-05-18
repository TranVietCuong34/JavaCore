package KeThua_abstract;

public abstract class PhuongTienDichuyen {
	private String loaiPhuongTien;
	private HangSX hangSX;
	public PhuongTienDichuyen(String loaiPhuongTien, HangSX hangSX) {
		super();
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSX = hangSX;
	}
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}
	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}
	public HangSX getHangSX() {
		return hangSX;
	}
	public void setHangSX(HangSX hangSX) {
		this.hangSX = hangSX;
	}
	
	public String layTenHangSX() {
		return this.hangSX.getTenHangSx();
	}
	public void batdau() {
		System.out.println("Bat dau");
	}
	public void dungLai() {
		System.out.println("Dung Lai");
	}
	public void tangToc() {
		System.out.println("Tang toc");
	}
	public abstract double layVanToc();
}
