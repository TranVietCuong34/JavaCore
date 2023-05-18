package Array;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 =new SinhVien(150, "Tran Van Thanh", "Lop 1", 9);
		SinhVien sv2 =new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		SinhVien sv3 =new SinhVien(199, "Nguyen Van An", "Lop 2", 8);
		SinhVien sv4 =new SinhVien(199, "Nguyen Van Binh", "Lop 2", 8);
		SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};
		
		System.out.println("Ban Dau: "+Arrays.toString(a_sv));
		
		// Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi sap xep: "+Arrays.toString(a_sv));
		
		// hàm tìm kiếm
		System.out.println("Tim kiem An : " + Arrays.binarySearch(a_sv, sv1));
		
		

	}
}
