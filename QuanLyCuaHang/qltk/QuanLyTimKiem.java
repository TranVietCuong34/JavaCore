package Class.day10_ArrayList.QuanLyCuaHang.qltk;

import java.util.ArrayList;
import java.util.Scanner;

import Class.day10_ArrayList.QuanLyCuaHang.qlbh.GioHang;
import Class.day10_ArrayList.QuanLyCuaHang.qlbh.QuanLyGioHang;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyLoaiHang;

public class QuanLyTimKiem {

	static Scanner sc = new Scanner(System.in);
	public static void quanLyTimKiem() {
		do {
			System.out.println("\n------TÌM KIẾM THÔNG TIN-------");
			System.out.println("Chọn chức năng tìm kiếm");
			System.out.println("\t1. Tìm kiếm thông tin loại hàng");
			System.out.println("\t2. Tìm kiếm thông tin hàng hóa");
			System.out.println("\t3. Tìm kiếm thông tin khách hàng");
			System.out.println("\t4. Tìm kiếm giỏ hàng");
			System.out.println("\t0. quay lại");
			
			System.out.println("Lựa chọn của bạn");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1: timKiemLoaiHang();	break;
			case 2: timKiemHangHoa();	break;
			case 3: timKiemKhachHang();	break;
			case 4: timKiemGioHang();	break;
			case 0: return;
			default: System.out.println("Nhập sai lựa chọn");
			}
		}while(true);
	}

	private static void timKiemLoaiHang() {
		// TODO Auto-generated method stub
		System.out.println("\n----------Tìm kiếm loại hàng-------------");
		System.out.print("Nhập ID loại hàng: ");
		int id = Integer.parseInt(sc.nextLine());
		int index = QuanLyLoaiHang.find(id);
		if(index == -1) {
			System.out.println("Ko có loại hàng này");
			return;
		}
		System.out.println("Thông tin loại hàng");
		QuanLyLoaiHang.getList().get(index).display();
	}

	private static void timKiemHangHoa() {
		// TODO Auto-generated method stub
		
	}

	private static void timKiemKhachHang() {
		// TODO Auto-generated method stub
		
	}

	private static void timKiemGioHang() {
		// TODO Auto-generated method stub
		do {
			System.out.println("\n------TÌM KIẾM GIỎ HÀNG-------");
			System.out.println("Chọn cách tìm kiếm");
			System.out.println("\t1. Tìm kiếm theo id giỏ hàng");
			System.out.println("\t2. Tìm kiếm theo id khách hàng ");
			System.out.println("\t0. quay lại");
			
			System.out.println("Lựa chọn của bạn");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1: timKiemTheoIDGio();	break;
			case 2: timKiemTheoIDKhachHang();	break;
			case 0: return;
			default: System.out.println("Nhập sai lựa chọn");
			}
		}while(true);
	}

	private static void timKiemTheoIDGio() {
		// TODO Auto-generated method stub
		System.out.print("Nhập id giỏ hàng: ");
		int id = Integer.parseInt(sc.nextLine());
		int index = QuanLyGioHang.findByIdGio(id);
		if(index == -1) {
			System.out.println("K có giỏ hàng nào");
		}
		else {
			System.out.println("Giỏ hàng tìm đc");
			QuanLyGioHang.list.get(index).display();
		}
	}

	private static void timKiemTheoIDKhachHang() {
		// TODO Auto-generated method stub
		System.out.print("Nhập id Khách hàng: ");
		int id = Integer.parseInt(sc.nextLine());
		ArrayList<GioHang> ls = QuanLyGioHang.findByIdKhach(id);
		if(ls.size()==0) {
			System.out.println("Ko tìm đc giỏ hàng nào");
			for(GioHang x : ls) {
				x.display();
				System.out.println("--------------------------------------");
			}
		}
	}
}
