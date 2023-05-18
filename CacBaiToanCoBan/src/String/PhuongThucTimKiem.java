package String;

public class PhuongThucTimKiem {
	public static void main(String[] args) {
	 String s1 = "xin chao co chu, xin chao cac ban !";
	 String s2 = "xin chao";
	 String s3 = "xin chao 123";
	 // hàm indexOf
	 System.out.println("vi tri cua s2 trong s1 la: "+s1.indexOf(s2));
	 System.out.println("vi tri cua s2 trong s1 la: "+s1.indexOf(s3));
	 
	 // sử dụng vị trí bắt đầu
	 System.out.println(s1.indexOf(s2, 2));
	 
	 // hàm lastIndexof => tìm kiếm từ phải sang trái
	 System.out.println("vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.indexOf(s2));
	 System.out.println("vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));
	 
	 
	 
	 
	 
	}
}
