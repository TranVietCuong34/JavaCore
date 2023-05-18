package String;

import java.util.Iterator;
import java.util.Scanner;

public class PhuongThucKtra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("------");
		
		// hàm length() ==> lấy độ dài chuỗi
		System.out.println(s.length());
		
		// hàm charAt(vị trí) ==> lấy ra 1 ký tự tại vị trí
		for (int i = 0 ; i < s.length();i++) {
			System.out.println("vi tri " + i + " la " + s.charAt(i));
		}
		
		// hàm getChar(vị trí bắt đầu , vị trí kết thúc , mảng dữ liệu, vị trí bất đầu lưu của mảng)
		
		char[] arrChar = new char[100];
		s.getChars(2, 5, arrChar, 2);
		for (int i = 0 ; i< arrChar.length;i++) {
			System.out.println("gia tri cua mang tai " + i + " la " + arrChar[i]);
		}
		 
		// hàm getBytes ==> có 3 cách, lấy ra giá trị số của các ký tự thành một mảng
		byte [] arrBytes =  s.getBytes();
		for(byte b : arrBytes) {
			System.out.println(b);
		}
		
		
		
	}
}
