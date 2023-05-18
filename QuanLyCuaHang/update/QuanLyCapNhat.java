package Class.day10_ArrayList.QuanLyCuaHang.update;

import java.util.Scanner;

public class QuanLyCapNhat {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void execute() {
		do {
			System.out.println("\n--------Cập nhật TT cửa hafg---------");
			System.out.println("Chọn thông tin cập nhật");
			System.out.println("\t1. Cập nhật thông tin loại hàng");
			System.out.println("\t2. Cập nhật thông tin hàng hóa");
			System.out.println("\t3. Cập nhật thông tin khách hàng");
			System.out.println("\t0. Quay lại");
			
			System.out.print("Lựa chọn của bạn: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1:			
				QuanLyLoaiHang.quanLyLoaiHang();
				break;
			case 2:
				QuanLyHangHoa.quanLyHangHoa();
				break;
			case 3:			
				break;
			case 0:	
				System.out.println("Đóng ứng dụng");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}
		}while(true);
	}
}
