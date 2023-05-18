package QuanLyHienThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Info.Diem;
import Info.MonHoc;

public class QuanLyHienThi {
	static Scanner sc = new Scanner(System.in);
	private static ArrayList<Diem> list = new ArrayList<>();
	private static ArrayList<MonHoc> ls = new ArrayList<>();
	
	public static void execute() {
		do {
			System.out.println("=================CAP NHAP THONG TIN CUA HANG=================");
			System.out.println("Chon thong tin cap nhap");
			System.out.println("1.Hien Thi Theo Sinh Vien");
			System.out.println("2.Hien Thi Theo Mon Hoc");
			System.out.println("0.Thoat");

			System.out.printf("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				HienThiSinhVien.HienThiSV();
				break;
			}
			case 2: {
				HienThiMonHoc.HienThiMh();;
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
