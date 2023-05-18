package QuanLyBoPhim;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(1, 1, 1911);
		Ngay ngay2 = new Ngay(10, 5, 2000);
		Ngay ngay3 = new Ngay(21, 9, 2023);
		
		HangSanXuat hxs1 = new HangSanXuat("Hang A","VN");
		HangSanXuat hxs2 = new HangSanXuat("Hang B","USA");
		HangSanXuat hxs3 = new HangSanXuat("Hang C","BA LAN");
		
		BoPhim boPhim1 = new BoPhim("Bo gia", 2020, hxs1, 10000, ngay1);
		BoPhim boPhim2 = new BoPhim("Running Man", 2021, hxs1, 90000, ngay2);
		BoPhim boPhim3 = new BoPhim("Kham pha Ba Lan", 20203, hxs1, 500000, ngay3);
		
		System.out.println("So sanh gia 1 re hon 2: " + boPhim1.ktraGiaVeReHon(boPhim2));
		System.out.println("So sanh gia 3 re hon 2: " + boPhim3.ktraGiaVeReHon(boPhim2));
		
		System.out.println("Ten hang san xuat bo phim 3: " + boPhim3.layTenHSX());

	}
}
