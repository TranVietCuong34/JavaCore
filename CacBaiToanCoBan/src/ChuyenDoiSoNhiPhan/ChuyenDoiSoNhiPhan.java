package ChuyenDoiSoNhiPhan;

import java.util.Scanner;

public class ChuyenDoiSoNhiPhan {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen duong: " );
		n = sc.nextInt();
		
		String nhiPhan = " ";
		while (n> 0) {
			nhiPhan = (n%2) + nhiPhan; 
			n = n/2;
			
		}
		System.out.println(nhiPhan);
	}
}
