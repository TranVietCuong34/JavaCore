package Stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<String>();
		// đưa giá trị vào stack
//		stackChuoi.push("gia tri"); 
		// lấy giá trị ra , xóa khỏi stack
//		stackChuoi.pop();
		// lấy giá trị ra ,không xóa khỏi stack
//		stackChuoi.peek();
		// xóa tất cả phần tử trong stack
//		stackChuoi.clear();
		// xác định giá trị có tồn tại trong stack hay không
//		stackChuoi.contains("gia trị");
		// lấy độ lớn của stack
//		stackChuoi.size();
		// ví dụ đảo ngược chuỗi
		System.out.println("nhap chuoi: ");
		String s = sc.nextLine();
		for(int i =0;i<s.length();i++) {
			stackChuoi.push(s.charAt(i) + "");
		}
		System.out.println("chuoi dao nguoc:  ");
		for(int i =0;i<s.length();i++) {
			System.out.print(stackChuoi.pop()); 
		}
		System.out.println();
		
		// ví dụ chuyển từ hệ thập phân sang hệ nhị phân
		System.out.println("nhap 1 so nguyen duong tu ban phim: ");
		Stack<String> stackSoDu = new Stack<String>();
		int x = sc.nextInt();
		while(x > 0) {
			int soDu = x %2 ;
			stackSoDu.push(soDu + "");
			x = x/2;
		}
		int n = stackSoDu.size();
		for (int i = 0 ; i <n;i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
