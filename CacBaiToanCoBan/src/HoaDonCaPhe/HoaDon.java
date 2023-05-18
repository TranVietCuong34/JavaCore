package HoaDonCaPhe;

import java.util.Objects;

public class HoaDon {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public void HoaDon() {

	}

	public HoaDon(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
		super();
		this.tenLoaiCaPhe = tenLoaiCaPhe;
		this.giaTien1Kg = giaTien1Kg;
		this.khoiLuong = khoiLuong;
	}

	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}

	public boolean ktraKhoiLuongLonhon(double kl) {
		return this.khoiLuong > kl;
	}

	public boolean ktraTongTienLonhon() {
		return tinhTongTien() > 500000;
	}

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500000)
			return tinhTongTien() * (x / 100);
		return 0;
	}

	public double sauGiamGia(double x) {
		return tinhTongTien() - giamGia(x);
	}

	@Override
	public int hashCode() {
		return Objects.hash(giaTien1Kg, khoiLuong, tenLoaiCaPhe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Double.doubleToLongBits(giaTien1Kg) == Double.doubleToLongBits(other.giaTien1Kg)
				&& Double.doubleToLongBits(khoiLuong) == Double.doubleToLongBits(other.khoiLuong)
				&& Objects.equals(tenLoaiCaPhe, other.tenLoaiCaPhe);
	}

	public static void main(String[] args) {
		HoaDon hd = new HoaDon("Trung nguyen", 10000, 1.5);
		HoaDon hd2 = new HoaDon("Trung nguyen", 50000, 15);
		System.out.println("tong tien hd: " + hd.tinhTongTien());
		System.out.println("tong tien hd2: " + hd2.tinhTongTien());
		System.out.println("kiem tra khoi luong > 2kg " + hd.ktraKhoiLuongLonhon(2));
		System.out.println("kiem tra khoi luong hd2 > 2kg " + hd2.ktraKhoiLuongLonhon(2));
		System.out.println("ktra tong tien lon hon 500k " + hd.ktraTongTienLonhon());
		System.out.println("ktra tong tien lon hon 500k " + hd2.ktraTongTienLonhon());
		System.out.println("Giam gia hd: " + hd.giamGia(10));
		System.out.println("Giam gia hd2: " + hd2.giamGia(10));
		System.out.println("Hoa don sau giam gia hd: " + hd.sauGiamGia(10));
		System.out.println("Hoa don sau giam gia hd2: " + hd2.sauGiamGia(10));
	}
}
