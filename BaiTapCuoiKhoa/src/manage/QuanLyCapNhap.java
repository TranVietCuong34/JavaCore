package manage;

import java.util.Scanner;

public class QuanLyCapNhap {
	static Scanner sc = new Scanner(System.in); 
	public static void execute() {
		do {
			System.out.println("=================CAP NHAP THONG TIN CUA HANG=================");
			System.out.println("Chon thong tin cap nhap");
			System.out.println("1.Cap nhap thong tin sinh vien");
			System.out.println("2.Cap nhap thong tin mon hoc");
			System.out.println("3.Cap nhap thong tin bang diem");
			System.out.println("0.Thoat");

			System.out.printf("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				QuanLySinhVien.quanLySinhVien();
				break;
			}
			case 2: {
				QuanLyMonHoc.quanLyMonHoc();
				break;
			}
			case 3: {
				QuanLyDiem.quanLyDiem();
				break;
			}
			case 0: {
				return;
			}
			default:
				throw new IllegalArgumentException("Lua chon khong hop le");
			}

		} while (true);
	}
}
