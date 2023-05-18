package QuanLyDanhSachSinhVien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;
	
	
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}


	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}


// 	1. Them sinh vien vao danh sach
	public void themSV(SinhVien sv) {
		this.danhSach.add(sv);
	}
//  2. Hien thi danh sach sinh vien
	public void hienThi() {
		for (SinhVien x : danhSach) {
			x.display();
		}
	}
//	3. Kiem tra danh sach co rong hay khong
	public boolean kiemTraDanhSachRong() {
		 return this.danhSach.isEmpty();
	}
//	4. Lay ra so luong sinh vien
	public int LaysoLuongSV() {
		return this.danhSach.size();
	}
//	5. Lam rong danh sach sinh vien. 
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
		}
//	6. ktra sinh vien co trong danh sach
	public int ktraSV(SinhVien sv) {
		for (int i = 0 ; i < danhSach.size();i++) {
			if(danhSach.get(i).getMaSV().compareTo(sv.getMaSV()) == 0){
				return i;
			}		
		}
		return -1;
	}
//  7.Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien.
	public boolean xoaSinhVien(SinhVien sv) {
			return this.danhSach.remove(sv);

	}
//  8. Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.
	public void timTenSV(String ten) {
		for(SinhVien sinhVien :danhSach) {
			if(sinhVien.getHoVaTen().trim().lastIndexOf(ten) >=0) {
				sinhVien.display();
			}
		}
	}
//  9. Xuat ra danh sach sinh vien co diem tu cao den thap
	public void sapXepDanhSachGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {
			public int compare(SinhVien sv1, SinhVien sv2) {
				return (int) (sv1.getDiemTB() - sv2.getDiemTB());
			}	
		});
	}
	
}
