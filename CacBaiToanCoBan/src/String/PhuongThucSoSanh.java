package String;

public class PhuongThucSoSanh {
	public static void main(String[] args) {
		String s1 = "tran viet cuong";
		String s2 = "tran viet cuong";
		String s3 = "TRAN VIET CUONG";
		
		// hàm equals => so sánh 2 chuỗi giống nhau có phân biệt hoa thường
		System.out.println("S1 equals s2: " + s1.equals(s2));
		System.out.println("S1 equals s3: " + s1.equals(s3));
		
		// hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau không phân biệt hoa thường
		System.out.println("s1 equals s2 " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equals s3 " + s1.equalsIgnoreCase(s3));
	
		
		// hàm compareTo => so sánh
		
		String sv1 = "tran viet cuong";
		String sv2 = "tran viet a";
		String sv3 = "tran viet h";
		String sv4 = "tran viet Cuong";
		
		System.out.println("sv1 compareTo sv2 " +sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3 " +sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4 " +sv1.compareToIgnoreCase(sv4));
		
		
		// hàm regionMatches => so sánh một đoạn
		
		String r1 = "TRAN CUONG"; 
		String r2 = "TRAN";
		boolean check = r1.regionMatches(0, r2, 0, 4);  //regionMatches(vị trí so sanh ở r1, chuỗi r2 , từ vị tí nào, số kí tự so sánh)
		System.out.println(check);
		
		// hàm startWith => hàm kiểm tra chuỗi bắt đầu bằng...
		String sdt = "0900911111";
		System.out.println(sdt.startsWith("09"));
		
		// hàm startWith => hàm kiểm tra chuỗi kết thúc bằng...
		String tenFile1 = "I.JPG";
		String tenFile2 = "java.PDF";
		if(tenFile1.endsWith(".JPG")) {
			System.out.println("File 1 la hinh anh");
		}
		else if (tenFile1.endsWith(".PDF"))
			System.out.println("File 1 la file PDF");
		
		
	}
}
