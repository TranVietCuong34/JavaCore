package Interface;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test cau A");
		
		MayTinhCasioFX550 mfx500 = new MayTinhCasioFX550();
		MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
		
		System.out.println("5+3 = " + mfx500.cong(5,3));
		System.out.println("10+3 = " + mvn500.nhan(10,3));
	}
}
