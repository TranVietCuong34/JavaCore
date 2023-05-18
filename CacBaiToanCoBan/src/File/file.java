package File;

import java.io.File;
import java.util.Scanner;

public class file {
	File file;

	public file(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean ktraThucThi() {
		// kiểm tra file có thể thực thi
		return this.file.canExecute();
	}

	public boolean ktraRead() {
		// kiểm tra file có thể thực thi
		return this.file.canRead();
	}

	public boolean ktraGhi() {
		// kiểm tra file có thể thực thi
		return this.file.canWrite();
	}

	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void inTen() {
		System.out.println(this.file.getName());
	}

	public void ktraThuMucHoacTapTin() {
		if (this.file.isDirectory()) {
			System.out.println("Day la thu muc!");
		} else {
			System.out.println("Day la tap tin!");
		}
	}

	public void inDanhSachCacFileCon() {
		if (this.file.isDirectory()) {
			System.out.println("Cac tap tin con/ thu muc con la: ");
			File[] mang = this.file.listFiles();
			for (File file : mang) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.out.println("Day la tap tin, Khong co du lieu con ben trong");
		}
	}

	public void inCayThuMuc() {
		this.inCayThuMucChiTiet(this.file, 1);
	}

	public void inCayThuMucChiTiet(File f, int bac) {
		for (int i = 0 ; i < bac ;i++) {
			System.out.print("\t");
		}
		System.out.println(f.getName());
		if(f.canRead() && f.isDirectory()) {
			File [] mangConFiles = f.listFiles();
			for(File fx : mangConFiles) {
				inCayThuMucChiTiet(fx, bac+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhap ten file: ");
		String tenFile = sc.nextLine();
		file f = new file(tenFile);
		do {
			System.out.println("============MENU============");
			System.out.println("1.Kiem tra file co the thuc thi");
			System.out.println("2.Kiem tra file co the thuc ghi");
			System.out.println("3.Kiem tra file co the thuc doc");
			System.out.println("4.In duong dan");
			System.out.println("5.In ten file");
			System.out.println("6.Kiem tra file la thu muc hoac tap tin");
			System.out.println("7.In ra danh sach cac file con");
			System.out.println("8.In ra cay thu muc");
			System.out.println("0.Thoat");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				System.out.println(f.ktraThucThi());

				break;
			case 2:
				System.out.println(f.ktraGhi());

				break;
			case 3:
				System.out.println(f.ktraRead());
				break;
			case 4:
				f.inDuongDan();
				break;
			case 5:
				f.inTen();
				break;
			case 6:
				f.ktraThuMucHoacTapTin();
				break;
			case 7:
				f.inDanhSachCacFileCon();
				break;
			case 8:
				f.inCayThuMuc();
				break;
			case 0:
				return;
			}

		} while (luaChon != 0);
	}
}
