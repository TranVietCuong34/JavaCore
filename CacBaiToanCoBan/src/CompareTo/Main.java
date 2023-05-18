package CompareTo;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1= new SinhVien(100, "a", "b", 10);
		SinhVien sv2= new SinhVien(44, "d", "e", 5);
		
		System.out.println(sv1.compareTo(sv2));
		
		
	}
}
