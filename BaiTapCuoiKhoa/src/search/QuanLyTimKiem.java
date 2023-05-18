package search;

import java.util.ArrayList;
import java.util.Scanner;

import Info.Diem;
import Info.SinhVien;
import Main.QuanLyBangDiem;
import manage.QuanLyDiem;
import manage.QuanLyMonHoc;
import manage.QuanLySinhVien;

public class QuanLyTimKiem {
	static Scanner sc = new Scanner(System.in);

	public static void quanLyTimKiem() {
		do {
			System.out.println("===========================TIM KIEM THONG TIN===========================");
			System.out.println("1.Tim kiem thong tin sinh vien");
			System.out.println("2.Tim kiem thong tin mon hoc");;
			System.out.println("0.Quay lai");
			
			System.out.println("Lua chon cua ban: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: {
				timKiemSinhVien();
				break;
			}
			case 2: {
				timKiemMonHoc();
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
	private static void timKiemSinhVien() {
		System.out.println("===========================TIM KIEM SINH VIEN===========================");
		System.out.println("Nhap MSV: ");
		int msv = Integer.parseInt(sc.nextLine());
		
		int index = QuanLyDiem.finIDdiem(msv); 
		if(index == -1) {
			System.out.println("Khong co sinh vien nao");
			return;
		}
		else {
			QuanLyDiem.getList().get(index).display3();
		}
			
		ArrayList<Diem> lst = new QuanLyDiem().findByIDSV(msv);
		int dem = 0;
		double tong =0 ;
		
		for( Diem x : lst) {
			x.display2();
			dem++;
		}
		
		for( Diem x : lst) {
			tong+= x.getDiem() / dem;
		}
		System.out.printf("Diem tong ket: %3.2f%n ",tong);
		
	}
	private static void timKiemMonHoc() {
		System.out.println("===========================TIM KIEM MON HOC===========================");
		System.out.println("Nhap Ma Mon Hoc: ");
		int mMH = Integer.parseInt(sc.nextLine());
		int index = QuanLyDiem.finIDMonHoc(mMH);
		if(index == -1) {
			System.out.println("Khong co mon hoc nao");
			return;
		}
		System.out.println("===========================THONG TIN MON HOC===========================");
		ArrayList<Diem> lst = new QuanLyDiem().findByIDMH(mMH);
		int dem = 0;
		double tong =0 ;
		for( Diem x : lst) {	
			x.display();
			dem++;
		}
		
		for( Diem x : lst) {
			tong+= x.getDiem() / dem;
		}
		System.out.printf("Diem tong ket: %3.2f%n ",tong);
		
		
	}

}
