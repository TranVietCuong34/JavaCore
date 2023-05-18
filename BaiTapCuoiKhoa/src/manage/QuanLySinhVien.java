package manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import Info.MonHoc;
import Info.SinhVien;

public class QuanLySinhVien {
	static Scanner sc = new Scanner(System.in);
	public static int autoNumber = 2020;
	
	private static ArrayList<SinhVien> list = new ArrayList<>();

	public static ArrayList<SinhVien> getList() {
		return list;
	}	
	public static void setList(ArrayList<SinhVien> list) {
		QuanLySinhVien.list = list;
	}
	
	public static void init() {
		list.add(new SinhVien(autoNumber++, "Tran Viet", "Cuong", 2002, "Nam"));
		list.add(new SinhVien(autoNumber++, "Nguyen Thi", "Loan", 1998, "Nu"));
		list.add(new SinhVien(autoNumber++, "Nguyen Viet", "Cuong", 2000, "Nam"));
		list.add(new SinhVien(autoNumber++, "Le Tuan", "Vu", 1999, "Nam"));
	}
	
	public static void quanLySinhVien() {
	
		do {
			System.out.println("=================CAP NHAP THONG TIN SINH VIEN=================");
			System.out.println("1.Xem danh sach sinh vien");
			System.out.println("2.Them sinh vien moi");
			System.out.println("3.Sua thong tin sinh vien");
			System.out.println("4.Xoa sinh vien");
			System.out.println("0.Quay lai");
			
			System.out.print("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				xemDsSV();
				break;
			}
			case 2: {
				themSV();
				break;
			}
			case 3: {
				suaSV();
				break;
			}
			case 4: {
				xoaSV();
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
	private static void xemDsSV() {
		System.out.println("======================DANH SACH SINH VIEN======================");
		System.out.printf("%-5s %9s %20s %22s %12s%n","STT","MA SV", "Ho Ten","Nam Sinh","Gioi Tinh");
		Collections.sort(list, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getTen().compareToIgnoreCase(o2.getTen());
			}
			
		});
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("%-10d",i+1);
			list.get(i).display();
		}
		System.out.println();
		
	}
	private static void themSV() {
	System.out.println("======================THEM SINH VIEN MOI======================");	
	System.out.println("Nhap MSV: ");
	int msv = Integer.parseInt(sc.nextLine());
	
	if(find(msv) != -1)
	{
		System.out.println("Sinh vien da co trong danh sach");
		return;
	}
	System.out.println("Nhap ho: ");
	String hoDem = sc.nextLine();
	System.out.println("Nhap ten: ");
	String name = sc.nextLine();
	System.out.println("Nam sinh: ");
	int namSinh = Integer.parseInt(sc.nextLine());
	System.out.println("Nhap gioi tinh: ");
	String gioiTinh = sc.nextLine();
	
	SinhVien newSv = new SinhVien(msv, hoDem, name, namSinh, gioiTinh);
	
	list.add(newSv);
	System.out.println("Them sinh vien thanh cong!");
	
	}
	private static void suaSV() {
	System.out.println("======================SUA SINH VIEN MOI======================");	
	System.out.println("Nhap MSV: ");
	int msv = Integer.parseInt(sc.nextLine());
	int index = find(msv);
	if( index ==-1)
	{
		System.out.println("Sinh Vien Khong Co Trong Danh Sach");
		return;
	}
	System.out.println("Nhap ho: ");
	String hoDem = sc.nextLine();
	if(hoDem.trim().length()==0) {
		System.out.println("Ten loai hang khong duoc bo trong");
		return;
	}
	System.out.println("Nhap ten: ");
	String name = sc.nextLine();
	if(name.trim().length()==0) {
		System.out.println("Ten loai hang khong duoc bo trong");
		return;
	}
	System.out.println("Nam sinh: ");
	int namSinh = Integer.parseInt(sc.nextLine());
	System.out.println("Nhap gioi tinh: ");
	String gioiTinh = sc.nextLine();
	
	list.get(index).setHoDem(hoDem);
	list.get(index).setTen(gioiTinh);
	list.get(index).setNamSinh(namSinh);
	list.get(index).setGioiTinh(gioiTinh);
	
	System.out.println("Sua thong tin sinh vien thanh cong!");
	}
	
	
	private static void xoaSV() {
	System.out.println("======================XOA SINH VIEN======================");	
	System.out.println("Nhap msv muon xoa: ");
	int msv = Integer.parseInt(sc.nextLine());
	int index = find(msv);
	if(index == -1) {
		System.out.println("Sinh Vien Khong Co Trong Danh Sach");
		return;
	}
	// nếu có trong bảng điểm thì không được xoá
	if(QuanLyDiem.finIDdiem(msv) != -1 ) {
		System.out.println("Khong the xoa sinh vien vi da co trong bang diem");
		return;
	}
	list.remove(index);
	
	System.out.println("Xoa thanh cong!");
	
	}

	// tìm kiếm sinh viên trong danh sách theo id
	public static int  find(int msv) {
		 for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaSV() == msv)
				return i;
		}
		 return -1;
	}
	// tìm kiếm tên sinh viên trong danh sách theo name
	public static int  find(String name) {
		 for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTen().compareToIgnoreCase(name)==0)
				return i;
		}
		 return -1;
	}
	// lấy tên sinh viên theo id
	public static String getNameSV(int msv) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaSV() == msv)
				return list.get(i).getTen();
		}
		return null;
	}
	
	public static String getHoSV(int msv) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaSV() == msv)
				return list.get(i).getHoDem();
		}
		return null;
	}

	public static SinhVien TimSV(int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getMaSV() == id) {
				return list.get(i);
			}
		}
		return null;
	}
	
	
}
