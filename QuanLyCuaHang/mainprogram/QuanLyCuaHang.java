package Class.day10_ArrayList.QuanLyCuaHang.mainprogram;

import java.util.Scanner;

import Class.day10_ArrayList.QuanLyCuaHang.qlbh.QuanLyBanHang;
import Class.day10_ArrayList.QuanLyCuaHang.qltk.QuanLyTimKiem;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyCapNhat;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyHangHoa;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyKhachHang;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyLoaiHang;
import Class.day4_CauTrucDieuKhien2.BaiTap4.main;

public class QuanLyCuaHang {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		QuanLyLoaiHang.init();
		QuanLyHangHoa.init();
		
		do {
			System.out.println("\n========CHƯƠNG TRÌNH QUẢN LÝ CỬA HÀNG=========");
			System.out.println("Chọn một chức năng quản lý");
			System.out.println("\t1. Cập nhật thông tin cửa hàng");
			System.out.println("\t2. Quản lý mua/bán hàng");
			System.out.println("\t3. Tìm kiếm thông tin");
			System.out.println("\t0. Thoát");
			
			System.out.println("Lựa chọn của bạn: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:	
				QuanLyCapNhat.execute();
				break;
			case 2:	
				QuanLyBanHang.quanLyBanHang();
				break;
			case 3:			
				QuanLyTimKiem.quanLyTimKiem();
				break;
			case 0:	
				System.out.println("Đóng ứng dụng");
				System.exit(0);
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}
		}while(true);
	}
}
