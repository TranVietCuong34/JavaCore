package QuanLyMayTinh;

public class HangSanXuat {
	private String tenHSX;
	private QuocGia quocGia;
	
	public String getTenHSX() {
		return tenHSX;
	}
	public void setTenHSX(String tenHSX) {
		this.tenHSX = tenHSX;
	}
	public QuocGia getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	public HangSanXuat(String tenHSX, QuocGia quocGia) {
		super();
		this.tenHSX = tenHSX;
		this.quocGia = quocGia;
	}
	public String layTenQuocGia() {
		return this.quocGia.getTenQG();
	}

}
