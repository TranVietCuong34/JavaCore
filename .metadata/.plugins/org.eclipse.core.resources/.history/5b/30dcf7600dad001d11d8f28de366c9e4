package QuanLyHienThi;

import java.util.ArrayList;

import Info.Diem;
import manage.QuanLyDiem;



public class HienThiMonHoc {
	private static ArrayList<Diem> list = QuanLyDiem.getList();
	private static ArrayList<DanhSachMonHoc> list_mh = new ArrayList<DanhSachMonHoc>();
	
	public static ArrayList<Info.SinhVien> DanhSachSV(int id) {
		ArrayList<Info.SinhVien> list_sv = new ArrayList<Info.SinhVien>();
		for (Diem diem : list) {
			if (diem.getmaMH() == id) {
				list_sv.add(manage.QuanLySinhVien.TimSV(diem.getmaSV()));
			}
		}
		return list_sv;
	}
	public static ArrayList<Integer> dsMaMh() {
		ArrayList<Integer> list_mMH = new ArrayList<Integer>();
		for (int i = 0; i < manage.QuanLyMonHoc.getList().size(); i++) {
			list_mMH.add(manage.QuanLyMonHoc.getList().get(i).getMaMH());
		}
		return list_mMH;
	}

	public static void HienThiMh() {
		
		ArrayList<Integer> x = dsMaMh();
		for (Integer i : x) 
			list_mh.add(new DanhSachMonHoc(manage.QuanLyMonHoc.TimMH(i), DanhSachSV(i)));
		for (DanhSachMonHoc s : list_mh) {
			s.display();
			System.out.println();
		}
	}



}
