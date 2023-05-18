package QuanLyHienThi;

import java.util.ArrayList;

import Info.Diem;
import Info.MonHoc;
import manage.QuanLyDiem;
import manage.QuanLyMonHoc;


public class HienThiSinhVien {
	private static ArrayList<Diem> list  = QuanLyDiem.getList();
	private static ArrayList<DanhSachSinhVien> list_sv = new ArrayList<DanhSachSinhVien>();

	public static ArrayList<MonHoc> danhSachMH(int id){
		ArrayList<MonHoc> list_MH = new ArrayList<MonHoc>();
			for(Diem diem :list) {
				if(diem.getmaSV() == id ) {
					list_MH.add(QuanLyMonHoc.TimMH(diem.getmaMH()));
					
				}
			}
			return list_MH;		
	}
	public static ArrayList<Integer> dsMaSV() {
		ArrayList<Integer> list_msv = new ArrayList<Integer>();
		for (int i = 0; i < manage.QuanLySinhVien.getList().size(); i++) {
			list_msv.add(manage.QuanLySinhVien.getList().get(i).getMaSV());
		}
		return list_msv;
	}

	public static void HienThiSV() {
		
		ArrayList<Integer> x = dsMaSV();
		for (Integer i : x) 
			list_sv.add(new DanhSachSinhVien(manage.QuanLySinhVien.TimSV(i), danhSachMH(i)));
		System.out.println("===============================BANG DIEM SINH VIEN===============================");
		for (DanhSachSinhVien s : list_sv) {
			s.display();
			System.out.println();
		}
	}



}
