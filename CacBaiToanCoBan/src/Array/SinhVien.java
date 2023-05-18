package Array;

public class SinhVien implements Comparable<SinhVien>{
	private int maSV;
	private String hoVaTen;
	private String tenLop;
	private double diemTB;
	public SinhVien(int maSV, String hoVaTen, String tenLop, double diemTB) {
		super();
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ")  >= 0 ) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}
		else {
			return s;
		}
	}
	@Override
	public int compareTo(SinhVien o) {
		String tenThis = this.getTen();
		String tenO = o.getTen();
		return tenThis.compareTo(tenO);
	}
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTB=" + diemTB + "]";
	}
	

	
}
