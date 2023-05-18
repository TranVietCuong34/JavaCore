package Array;

import java.util.Arrays;

public class Sort_Search {
	public static void main(String[] args) {
		int  [] a = new int [] {1,4,2,6,7,8,9};
		int [] b = new int[15];
		
		// hàm sắp xếp tăng
		Arrays.sort(a);
		System.out.println("mang a khi sap xep : " + Arrays.toString(a));
		
		// hàm tìm kiếm
		/* binarySearch : thực hiện khi mảng đã sắp xếp*/
		System.out.println("vi tri 4 trong mang: " + Arrays.binarySearch(a, 4));
		System.out.println("vi tri -8 trong mang: " + Arrays.binarySearch(a, -1));
		
		// hàm điền giá trị
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
		
		
		String s1 = "xin chao cac ban, toi la Cuong!";
		String [] h = s1.split(" ");
		System.out.println(Arrays.toString(h));
		
		
		
		
		
		
		
	}
}
