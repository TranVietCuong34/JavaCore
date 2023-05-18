package Main;

import java.util.Scanner;

import manage.QuanLyDiem;
import manage.QuanLyMonHoc;
import manage.QuanLySinhVien;
import search.QuanLyTimKiem;


public class QuanLyBangDiem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		QuanLySinhVien.init();
		QuanLyMonHoc.init();
		QuanLyDiem.init();
		do {
			System.out.println("=================CHUONG TRINH QUAN LY CUA HANG=================");
			System.out.println("Chon mot chuc nang quan ly");
			System.out.println("1.Cap nhap danh sach");
			System.out.println("2.Hien Thi");
			System.out.println("3.Quan ly tim kiem");
			System.out.println("0.Thoat");

			System.out.printf("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				manage.QuanLyCapNhap.execute();
				break;
			}
			case 2:
				QuanLyHienThi.QuanLyHienThi.execute();
			case 3: {
				QuanLyTimKiem.quanLyTimKiem();
				break;
			}
			case 0: {
				System.out.println("Dong ung dung");
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Lua chon khong hop le");
			}

		} while (true);
	}
}
