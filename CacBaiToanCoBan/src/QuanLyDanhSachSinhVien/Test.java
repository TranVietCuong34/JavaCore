package QuanLyDanhSachSinhVien;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();

		do {
			System.out.println("====================MENU====================");		
			System.out.println("1.	Them sinh vien vao danh sach.\n" 
					+ "2.	In danh sach sinh vien ra man hinh.\n"
					+ "3.	Kiem tra danh sach co rong hay khong.\n"
					+ "4.	Lay ra so luong sinh vien trong danh sach.\n" + "5.	Lam rong danh sach sinh vien.\n"
					+ "6.	Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.\n"
					+ "7.	Xoa mot sinh vien ra khoi danh sach dua trên ma sinh vien.\n"
					+ "8.	Tim kiem tat ca sinh vien dua tren Ten duoc nhap tu ban phim.\n"
					+ "9.	Xuat ra danh sach sinh vien co diem tu cao den thap.\n" + "0.   Thoat khoi chuong trinh");
			System.out.printf("Vui long chon chuc nang: ");
			int luaChon;
			luaChon = Integer.parseInt(sc.nextLine());
			switch (luaChon) {
			case 1:
				System.out.print("Nhap MSV : ");
				String maSV = sc.nextLine();
				System.out.print("Nhap ten SV : ");
				String tenSV = sc.nextLine();
				System.out.print("Nhap nam sinh : ");
				int namSinh = Integer.parseInt(sc.nextLine());
				System.out.print("Nhap DTB : ");
				double dTB = Double.parseDouble(sc.nextLine());
				SinhVien sv  = new SinhVien(maSV, tenSV, namSinh, namSinh);
				dssv.themSV(sv);
				System.out.println("Them Thanh Cong!");
				break;
			case 2:
				System.out.println("====================Danh sach sinh vien====================");
				dssv.hienThi();
				break;
			case 3:
				if(dssv.kiemTraDanhSachRong()) {
					System.out.println("Danh sach rong !");
				}
				else {
					System.out.println("Danh sach da co sinh vien !");
				}
				break;
			case 4:
				System.out.println("So luong sinh vien co trong danh sach: " + dssv.LaysoLuongSV());
				break;
			case 5:
				dssv.lamRongDanhSach();
				System.out.println("Danh sach da duoc xoa!");
				break;
			case 6:
				System.out.println("Nhap ma sinh vien: "); 
				String maSinhVien = sc.nextLine();
				sv = new SinhVien(maSinhVien);
				if (dssv.ktraSV(sv) != -1) {
					System.out.println("Sinh vien co trong danh sach !");
				}
				else {
					System.out.println("Sinh vien khong co trong danh sach !");
				}
				break;
			case 7:
				System.out.println("Nhap MSV can xoa: ");
				String maSv2 = sc.nextLine();
				SinhVien sv2 = new SinhVien(maSv2);
				dssv.xoaSinhVien(sv2);
				System.out.println("Xoa thanh cong!");

				break;
			case 8:
				System.out.println("Nhap ten sinh vien can tim: ");
				String ten = sc.nextLine();
				dssv.timTenSV(ten);
				break;
			case 9:
				dssv.sapXepDanhSachGiamDanTheoDiem();
				dssv.hienThi();
				break;
			case 0:
				return;
			}
		} while (true);
	}
}
