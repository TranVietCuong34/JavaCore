package Info;

import java.util.ArrayList;

import manage.QuanLyMonHoc;
import manage.QuanLySinhVien;

public class Diem {
	private int maSV;
	private int maMH;
	private double diem;
	private  ArrayList<MonHoc> list = new ArrayList<>();

	public void display() {
		String nameSV = QuanLySinhVien.getHoSV(maSV) + " " + QuanLySinhVien.getNameSV(maSV);
		String nameMH = QuanLyMonHoc.getNameMH(maMH);
		System.out.printf("%-10s %-12s %-22s  %-15.1f%n", this.maMH, nameMH, nameSV, this.diem);

	}

	public void display2() {
		String nameSV = QuanLySinhVien.getNameSV(maSV);
		String nameMH = QuanLyMonHoc.getNameMH(maMH);
		System.out.printf("%-10s %-12s %-10.2f%n", this.maMH, nameMH, this.diem);
	}

	public void display3() {
		String nameSV = QuanLySinhVien.getHoSV(maSV) + " " + QuanLySinhVien.getNameSV(maSV);
		System.out.printf("%-10s %-20s%n", this.maSV, nameSV);
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-3d ",i+1);
			list.get(i).display();	
		}
	}


	public Diem(int maSV, int maMH, double diem) {
		super();
		this.maSV = maSV;
		this.maMH = maMH;
		this.diem = diem;
	}

	public Diem() {
		super();
	}

	public int getmaSV() {
		return maSV;
	}

	public void setmaSV(int maSV) {
		this.maSV = maSV;
	}

	public int getmaMH() {
		return maMH;
	}

	public void setmaMH(int maMH) {
		this.maMH = maMH;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	public ArrayList<MonHoc> getList() {
		return list;
	}
	public void setList(ArrayList<MonHoc> list) {
		this.list = list;
	}
	

}
