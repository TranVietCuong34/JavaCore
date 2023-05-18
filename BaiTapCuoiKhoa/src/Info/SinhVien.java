package Info;

public class SinhVien {
	private int maSV;
	private String HoDem;
	private String Ten;
	private int namSinh;
	public SinhVien(int maSV) {
		this.maSV = maSV;
	}
	private String GioiTinh;
	
	
	public void display() {
		System.out.printf("%-15d %-20s %10s %10s%n",maSV,HoDem+ " " + Ten,namSinh,GioiTinh);
	}
	
	
	public SinhVien(int maSV, String hoDem, String ten, int namSinh, String gioiTinh) {
		this.maSV = maSV;
		HoDem = hoDem;
		Ten = ten;
		this.namSinh = namSinh;
		GioiTinh = gioiTinh;
	}
	public SinhVien() {
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoDem() {
		return HoDem;
	}
	public void setHoDem(String hoDem) {
		HoDem = hoDem;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	
	
	
}
