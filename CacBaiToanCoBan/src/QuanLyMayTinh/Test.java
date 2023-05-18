package QuanLyMayTinh;

public class Test {
	
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(3, 4, 2001);
		QuocGia qg1 = new QuocGia("VN", "Viet Nam");		
		HangSanXuat hxs1 = new HangSanXuat("VNLaptop", qg1);	
		MayTinh mt1 = new MayTinh(hxs1, ngay1, 1000, 12);
		
		Ngay ngay2 = new Ngay(30, 4, 2001);
		QuocGia qg2 = new QuocGia("USA", "My");		
		HangSanXuat hxs2 = new HangSanXuat("VNLaptop", qg2);		
		MayTinh mt2 = new MayTinh(hxs2, ngay2, 3000, 12);
		
		System.out.println("So sanh gia thap hon");
		System.out.println("M1 < M2: " + mt1.ktraGiaThapHon(mt2));
		
		System.out.println(mt2.layTenQG());
		
	}
}
