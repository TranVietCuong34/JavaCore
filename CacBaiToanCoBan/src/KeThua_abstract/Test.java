package KeThua_abstract;

public class Test {
	public static void main(String[] args) {
		HangSX h1 = new HangSX("Hang 1", "VN");

		PhuongTienDichuyen p1 = new XeOto("oto", h1, "xang");

		System.out.println("lay hang san xuat: " + p1.layTenHangSX());

		p1.batdau();
		p1.dungLai();
		System.out.println(p1.layVanToc());
		
	}
}
