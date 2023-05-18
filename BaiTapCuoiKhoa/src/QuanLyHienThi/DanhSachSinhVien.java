package QuanLyHienThi;

import java.util.ArrayList;;

public class DanhSachSinhVien {

	private Info.SinhVien sv;
	private ArrayList<Info.MonHoc> list_mh;

	public DanhSachSinhVien() {
		super();
	}

	public DanhSachSinhVien(Info.SinhVien sv, ArrayList<Info.MonHoc> list_mh) {
		super();
		this.sv = sv;
		this.list_mh = list_mh;
	}

	public void display() {
		System.out.println("---------THONG TIN SINH VIEN---------");
		System.out.println("Ma sinh vien: " + sv.getMaSV() );
		System.out.println("Ho ten: "+ sv.getHoDem() + " " + sv.getTen());
		System.out.println("Nam sinh: " + sv.getNamSinh() );
		System.out.println("Gioi Tinh: "+ sv.getGioiTinh());
		System.out.printf("%-3s %10s %10s %10s %10s%n", "STT", "Ma mon", "Ten mon", "He so", "Diem");
		int stt = 1;
		for (Info.MonHoc x : list_mh) {
			System.out.printf("%-3d ", stt++);
			System.out.printf("%9d %9s %12.1f %10.1f%n", x.getMaMH(), x.getTenMH(), x.getHeSoMH(),
					manage.QuanLyDiem.getList().get(manage.QuanLyDiem.indexOf(x.getMaMH(), sv.getMaSV())).getDiem());

		}
	}
}