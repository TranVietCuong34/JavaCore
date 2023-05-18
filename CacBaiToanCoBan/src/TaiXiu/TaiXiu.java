package TaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		double taiKhoanNguoiChoi = 5000000;
		// định dạng tiền
		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		do {
			System.out.println("---------Moi ban lua chon---------");
			System.out.println("Chon (1) de tiep tuc choi.");
			System.out.println("Chon (2) de thoat.");

			luaChon = sc.nextInt();

			switch (luaChon) {
			case 1:
				// dat cuoc
				System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi) + " ban muon dat cuoc bao nhieu ?");
				double tienCuoc;
				do {
					System.out.println("So tien cuoc : ");
					tienCuoc = sc.nextDouble();

				} while (tienCuoc < 0 || tienCuoc > taiKhoanNguoiChoi);

				// Chon tai xiu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("Chon 1 <-> TAI hoac 2 <-> XIU");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

				Random xucXac = new Random();

				int giaTri1 = xucXac.nextInt(5) + 1;
				int giaTri2 = xucXac.nextInt(5) + 1;
				int giaTri3 = xucXac.nextInt(5) + 1;

				int tong = giaTri1 + giaTri2 + giaTri3;

				// tinh ket qua

				System.out.println("Ket qua : " + giaTri1 + "-" + giaTri2 + "-" + giaTri3);

				if (tong == 3 || tong == 18) {
					System.out.println("Tong: " + tong + "Nha cai an het , ban thua !");
					taiKhoanNguoiChoi -= tienCuoc;
					System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("Tong: " + tong + " ==> XIU");
					if (luaChonTaiXiu == 1) {
						System.out.println("Ban da thua cuoc");
						taiKhoanNguoiChoi -= tienCuoc;
						System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("Ban da thang cuoc");
						taiKhoanNguoiChoi += tienCuoc;
						System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
					}
				} else {
					System.out.println("Tong: " + tong + " ==> TAI");
					if (luaChonTaiXiu == 2) {
						System.out.println("Ban da thua cuoc");
						taiKhoanNguoiChoi -= tienCuoc;
						System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("Ban da thang cuoc");
						taiKhoanNguoiChoi += tienCuoc;
						System.out.println("Tai khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
					}
				}
				break;
			case 2:
				return;

			}

		} while (luaChon == 1);
	}
}
