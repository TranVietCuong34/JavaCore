package manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import Info.Diem;
import Info.MonHoc;
import Info.SinhVien;

public class QuanLyDiem {
	static Scanner sc = new Scanner(System.in);
	private static ArrayList<Diem> list = new ArrayList<>();
	private static ArrayList<MonHoc> ls = new ArrayList<>();

	public static ArrayList<Diem> getList() {
		return list;
	}

	public static void setList(ArrayList<Diem> list) {
		QuanLyDiem.list = list;
	}

	// tìm kiếm sinh viên theo id trong bảng điểm
	public static int finIDdiem(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getmaSV() == id)
				return i;
		}
		return -1;
	}

	// tìm kiếm môn học theo id trong bảng điểm
	public static int finIDMonHoc(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getmaMH() == id)
				return i;
		}
		return -1;
	}
	// tính điểm trung bình
	public static double diemTB(int mMH) {
		double sum = 0;
		double dem = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getmaMH() == mMH) {
				sum += list.get(i).getDiem();
				dem++;
			} 	
		}
		return sum / dem;
	}
	// tìm kiếm mảng sinh viên theo id
	public static ArrayList<Diem> findByIDSV(int msv) {
		ArrayList<Diem> ls = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getmaSV() == msv) {
				ls.add(list.get(i));
			}
		}
		return ls;
	}

	// tìm kiếm mảng môn học theo id
	public static ArrayList<Diem> findByIDMH(int mMH) {
		ArrayList<Diem> ls = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getmaMH() == mMH) {
				ls.add(list.get(i));
			}
		}
		return ls;
	}
	// tìm môn học và mã sinh viên có trong bảng điểm không
	public static int indexOf(int id1, int id2) {
		for (int index = 0; index < list.size(); index++)
			if (list.get(index).getmaMH() == id1 && list.get(index).getmaSV() == id2)
				return index;

		return -1;
	}
	public static void init() {
		// mã sinh viên, mã môn học, điểm
		list.add(new Diem(2020, 3031, 10));
		list.add(new Diem(2021, 3032, 6));
		list.add(new Diem(2021, 3033, 4));
		list.add(new Diem(2022, 3032, 8));
		list.add(new Diem(2022, 3031, 5.5));
		list.add(new Diem(2023, 3033, 7.5));
		list.add(new Diem(2023, 3031, 9.5));

	}

	public static void quanLyDiem() {

		do {
			System.out.println("=================CAP NHAP DIEM=================");
			System.out.println("1.Them diem cho sinh vien");
			System.out.println("2.Sua diem sinh vien");
			System.out.println("3.Xoa diem sinh vien");
			System.out.println("4.Xem bang diem sinh vien");
			System.out.println("0.Quay lai");

			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				themDiemSV();
				break;
			}
			case 2: {
				suaDiemSV();
				break;
			}
			case 3: {
				xoaDiemSV();
				break;
			}
			case 4:
				xemDiem();
				break;
			case 0: {
				return;
			}
			default:
				System.out.println("Lua chon khong hop le");
			}

		} while (true);
	}

	private static void xemDiem() {
		Collections.sort(list, new Comparator<Diem>() {

			@Override
			public int compare(Diem o1, Diem o2) {
				return o1.getmaMH() - o2.getmaMH();
			}

		});
		System.out.printf("%-6s %8s %11s %15s %16s%n", "STT", "MA MON HOC", "TEN MON HOC", "SINH VIEN", "DIEM");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-10d", i + 1);
			list.get(i).display();
		}


	}

	private static void themDiemSV() {
		System.out.println("======================THEM DIEM CHO SINH VIEN======================");
		System.out.println("Nhap msv muon them diem: ");
		int msv = Integer.parseInt(sc.nextLine());
		int index1 = finIDdiem(msv);
		if (index1 == -1) {
			System.out.println("Sinh vien khong co trong danh sach");
			return;
		}
		System.out.println("Nhap ma mon hoc: ");
		int mMH = Integer.parseInt(sc.nextLine());

		int index2 = finIDMonHoc(mMH);
		if (index2 == -1) {
			System.out.println("Mon hoc da co diem!");
			return;
		}
		System.out.print("Nhap diem cho mon hoc: ");
		double score = Double.parseDouble(sc.nextLine());
		while(score < 0 || score > 10) {
			System.out.println("Nhap lai!");
			System.out.print("Nhap diem cho mon hoc: ");
			score = Double.parseDouble(sc.nextLine());
		}
		Diem d = new Diem(index1, index2, score);
		list.add(d);
		System.out.println("Them diem thanh cong!");
	}

	private static void suaDiemSV() {
		System.out.println("======================SUA DIEM SINH VIEN======================");
		System.out.println("Nhap MSV: ");
		int msv = Integer.parseInt(sc.nextLine());
		int index1 = finIDdiem(msv);

		if (index1 == -1) {
			System.out.println("Sinh vien khong co trong danh sach");
			return;
		}
		System.out.println("Nhap ma mon hoc: ");
		int mMH = Integer.parseInt(sc.nextLine());

		int index2 = finIDMonHoc(mMH);
		if (index2 == -1) {
			System.out.println("Mon hoc khong co trong danh sach");
			return;
		}

		System.out.println("Nhap diem: ");
		double diem = Double.parseDouble(sc.nextLine());
		while (diem < 0 || diem > 10) {
			System.out.println("Nhap diem khong hop le!");
			System.out.println("Nhap lai diem: ");
			diem = Double.parseDouble(sc.nextLine());
		}
		list.get(index1).setDiem(diem);
		System.out.println("Sua diem thanh cong!");
	}

	private static void xoaDiemSV() {
		System.out.println("======================XOA DIEM SINH VIEN======================");
		System.out.println("Nhap MSV: ");
		int msv = Integer.parseInt(sc.nextLine());
		int index1 = finIDdiem(msv);

		if (index1 == -1) {
			System.out.println("Sinh vien khong co trong danh sach");
			return;
		}
		System.out.println("Nhap ma mon hoc: ");
		int mMH = Integer.parseInt(sc.nextLine());

		int index2 = finIDMonHoc(mMH);
		if (index2 == -1) {
			System.out.println("Mon hoc khong co trong danh sach");
			return;
		}
		list.remove(index2);
		System.out.println("Xoa diem thanh cong!");
	}

}
