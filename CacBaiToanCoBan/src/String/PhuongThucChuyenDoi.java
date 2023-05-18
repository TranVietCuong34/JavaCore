package String;

public class PhuongThucChuyenDoi {
	public static void main(String[] args) {
		String s1 = "Cuong tran";
		String s2 = "viet";
		

		// hàm concat
		System.out.println(s1.concat(s2));
		// hàm replace
		
		String s3 = "HT 2001";
		String s6 =s3.replaceAll(s3, "cuong");
		System.out.println(s6);
		System.out.println(s3.replaceFirst("H","T"));
		System.out.println(s3.replace(s3, s6));
		
		// hàm chuyển về toLowerCase => chuyển về viết thường
		// hàm chuyển về toUpperCase => chuyển về viết hoa
		String s7 = s1.toLowerCase();
		String s8 = s1.toUpperCase();
		System.out.println(s7);
		System.out.println(s8);
		
		// trim() => xóa khoảng trắng ở đầu chuỗi
		String s9 = "          Tran viet cuong";
		System.out.println(s9.trim());
		
		// subString => cắt chuỗi con
		String s10 = "xin chao cac ban !";
		System.out.println(s10.substring(4));
		
	}
}
