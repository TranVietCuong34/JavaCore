package manage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Info.MonHoc;
import Info.SinhVien;

public class QuanLyMonHoc {
	static Scanner sc = new Scanner(System.in);
	public static int autoNumber = 3030;
	private static ArrayList<MonHoc> list = new ArrayList<>();
	
	
	public static ArrayList<MonHoc> getList() {
		return list;
	}
	public static void setList(ArrayList<MonHoc> list) {
		QuanLyMonHoc.list = list;
	}
	public static void init() {	
		list.add(new MonHoc(autoNumber++,"JAVA" , 2));
		list.add(new MonHoc(autoNumber++,"UDTT" , 1));
		list.add(new MonHoc(autoNumber++,"HPC" , 2));
		list.add(new MonHoc(autoNumber++,"OOP" , 1));	
	}
	public static void quanLyMonHoc() {
		
		do {
			System.out.println("=================CAP NHAP THONG TIN MON HOC=================");
			System.out.println("1.Xem danh sach mon hoc");
			System.out.println("2.Them mon hoc moi");
			System.out.println("3.Sua thong tin mon hoc");
			System.out.println("4.Xoa mon hoc");
			System.out.println("0.Quay lai");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				xemDsMH();
				break;
			}
			case 2: {
				themMH();
				break;
			}
			case 3: {
				suaMH();
				break;
			}
			case 4: {
				xoaMH();
				break;
			}
			case 0: {
				return;
			}
			default:
				System.out.println("Lua chon khong hop le");
			}

		} while (true);
	}
	private static void xemDsMH() {
		System.out.println("======================DANH SACH MON HOC======================");
		System.out.printf("%-5s %13s %14s %12s%n","STT","MA MON HOC", "TEN MON HOC","HE SO");
		Collections.sort(list, new Comparator<MonHoc>() {

			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				return o1.getTenMH().compareToIgnoreCase(o2.getTenMH());
			}
			
		});
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("%-10d",i+1);
			list.get(i).display();
		}
		System.out.println();
		
	}
	private static void themMH() {
		System.out.println("======================THEM MON HOC MOI======================");	
		System.out.println("Nhap ma mon hoc: ");
		int maMH = Integer.parseInt(sc.nextLine());
		int index = findMH(maMH);
		if(index != -1 ) {
			System.out.println("Mon hoc co trong danh sach");
			return;
		}
		System.out.println("Nhap ten MH moi: ");
		String name = sc.nextLine();
		if(name.trim().length() == 0 )
		{
			System.out.println("Ten mon hoc khong duoc bo trong");
			return;
		}
		System.out.println("Nhap he so mon hoc: ");
		int heSo = Integer.parseInt(sc.nextLine());
		
		MonHoc newMH = new MonHoc(maMH, name, heSo);
		list.add(newMH);
		System.out.println("Them mon hoc thanh cong!");
		
	}
	private static void suaMH() {
		System.out.println("======================SUA MON HOC MOI======================");	
		System.out.println("Nhap ma mon hoc moi: ");
		int maMH = Integer.parseInt(sc.nextLine());
		int index = findMH(maMH);
		if(index == -1 ) {
			System.out.println("Mon hoc khong co trong danh sach");
			return;
		}
		System.out.println("Nhap ten mon hoc moi: ");
		String name = sc.nextLine();
		if(name.trim().length()==0) {
			System.out.println("Ten mon hoc khong duoc de trong");
		}
		System.out.println("He so mon hoc moi: ");
		int heSo = Integer.parseInt(sc.nextLine());
		
		list.get(index).setTenMH(name);
		list.get(index).setHeSoMH(heSo);
		
		System.out.println("Sua thong tin mon hoc thanh cong!");
		
	}
	private static void xoaMH() {
		System.out.println("======================XOA MON HOC======================");	
		System.out.println("Nhap ma mon hoc muon xoa: ");
		int mMH = Integer.parseInt(sc.nextLine());
		int index = findMH(mMH);
		if(index == -1 ) {
			System.out.println("Mon hoc khong co trong danh sach");
			return;
		}
		// nếu có trong bảng điểm thì không được xoá
		if(QuanLyDiem.finIDMonHoc(mMH) != -1 ) {
			System.out.println("Khong the xoa sinh vien");
			return;
		}
		list.remove(index);
		
		System.out.println("Xoa thanh cong!");
		
	}
	// tìm kiếm mã môn học trong danh sách theo id
	public static int findMH(int maMH) {
		for(int i = 0 ; i< list.size();i++) {
			if(list.get(i).getMaMH() == maMH)
				return i;
		}
		return -1;
	}
	// tìm kiếm tên môn học trong danh sách theo id
	public static String getNameMH(int id) {
		for (int i = 0 ; i < list.size();i++) {
			if(list.get(i).getMaMH() == id) {
				return list.get(i).getTenMH();
			}
		}
		return null;
	}
	public static MonHoc TimMH(int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaMH() == id) {
				return list.get(i);
			}
		}
		return null;
	}
}
