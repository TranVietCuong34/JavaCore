package QuanLySach;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(3, 4, 2001);
		Ngay ngay2 = new Ngay(30, 4, 1975);
		Ngay ngay3 = new Ngay(10, 3, 2000);
		
		TacGia tg1 = new TacGia("A", ngay1);
		TacGia tg2 = new TacGia("B", ngay2);
		TacGia tg3 = new TacGia("C", ngay3);
		
		Sach sach1 = new Sach("Lap trinh C ", 5000, 2023, tg1);
		Sach sach2 = new Sach("Lap trinh Java ", 2000, 2020, tg2);
		Sach sach3 = new Sach("Lap trinh Mang ", 9000, 2020, tg3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So sanh NXB sach 1 va 3 " + sach1.ktraCungNam(sach3));
		System.out.println("So sanh NXB sach 2 va 3 " + sach2.ktraCungNam(sach3));
		
		System.out.println("Sach 1 giam gia 10%: " + sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam gia 20%: " + sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam gia 30%: " + sach3.giaSauKhiGiam(30));
	}
}
