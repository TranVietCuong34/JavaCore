package QuanLyDanhSachSinhVien;

import java.util.Objects;

public class SinhVien {
	private String maSV;
	private String hoVaTen;
	private int namSinh;
	private float diemTB;
	public SinhVien(String maSV) {
		super();
		this.maSV = maSV;
	}
	public SinhVien(String maSV, String hoVaTen, int namSinh, float diemTB) {
		super();
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	public SinhVien() {
		super();
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
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	
	public int compareTo(SinhVien o) {
		return this.maSV.compareTo(o.maSV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSV, other.maSV);
			
	}
	public void display() {
		System.out.printf("%-15s %-10s %10d %10.2f%n",maSV,hoVaTen,namSinh,diemTB);
	}
	

	
}
