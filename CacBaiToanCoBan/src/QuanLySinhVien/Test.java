package QuanLySinhVien;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(3, 4, 2001);
		Ngay ngay2 = new Ngay(17, 2, 2007);
		Ngay ngay3 = new Ngay(3, 4, 2001);

		Lop lop1 = new Lop("DH01", "CNTT");
		Lop lop2 = new Lop("DH02", "Quan tri");
		Lop lop3 = new Lop("DH03", "Du lich");

		SinhVien sv1 = new SinhVien("2020600322", "tran viet cuong", ngay1, 10, lop1);
		SinhVien sv2 = new SinhVien("2020600322", "tran viet a", ngay2, 8, lop2);
		SinhVien sv3 = new SinhVien("2020600322", "tran viet b", ngay3, 9, lop3);

		System.out.println("Ten khoa");
		System.out.println("SV1: " + sv1.layTenKhoa());
		System.out.println("SV2: " + sv2.layTenKhoa());
		System.out.println("SV3: " + sv3.layTenKhoa());

		System.out.println("Kiem tra thi dat");
		System.out.println("SV1: " + sv1.ktraThiDat());
		System.out.println("SV2: " + sv2.ktraThiDat());
		System.out.println("SV3: " + sv3.ktraThiDat());

		System.out.println("So sanh ngay sinh");
		System.out.println("SV1 vs SV2: " + sv1.ktraCungNgaySinh(sv2));
		System.out.println("SV1 vs SV3: " + sv1.ktraCungNgaySinh(sv3));
		
	}
}
