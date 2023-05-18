package Class.day10_ArrayList.QuanLyCuaHang.qlbh;

import java.util.Scanner;

public class QuanLyMuaBan {
	

	static Scanner sc = new Scanner(System.in);
	
	public static void quanLyMuaBan() {
		do {
			System.out.println("\n----------QUAN LY MUA BAN HANG---------");
			System.out.println("Chọn chức năng quản lý");
			System.out.println("\t1. Quản lý bán hàng (dành cho khách hàng)");
			System.out.println("\t2. Quản lý giỏ hàng (chủ cửa hàng)");
			System.out.println("\t0. Quay lại");
			
			System.out.print("Lựa chọn của bạn");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1: QuanLyBanHang.quanLyBanHang();break;			
			case 2: QuanLyMuaBan.quanLyMuaBan();	break;
			case 3: break;
			case 0: return;
			default: System.out.println("Lựa chọn ko hợp lệ");
			}
		}while(true);
	}
}
