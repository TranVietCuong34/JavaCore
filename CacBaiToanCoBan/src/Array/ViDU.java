package Array;

import java.util.Arrays;

public class ViDU {
	public static void main(String[] args) {
		// kiểu nguyên thủy 
		int [] mang1 = {1,2,3};
		
		//copy mảng
		int [] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println(Arrays.toString(mang1));
		System.out.println(Arrays.toString(mang1_a));
		
		//copy mảng dùng clone()
		int[] mang1_b = mang1_a.clone();
		mang1_a[0] = 9;
		System.out.println(Arrays.toString(mang1_a));
		
		// copy mảng dùng system arraycopy
		int mang_c[] = new int[mang1.length];
		System.arraycopy(mang1, 0, mang_c, 0, mang1.length);
		System.out.println(Arrays.toString(mang_c));
		mang_c[0] = 888;
		System.out.println(Arrays.toString(mang_c));
		
	}
}
