package File;

import java.io.File;
import java.io.IOException;

public class TaoTaoTapTinVaThuMuc {
	public static void main(String[] args) {
		// kiểm tra thư mục đã tồn tại hay chưa ?
		File folder1 = new File("F:\\DevPro\\JavaWeb\\JavaCore\\CacBaiToanCoBan");
		System.out.println(folder1.exists());

		// tạo thư mục

		// phương thức mkdir() => tạo 1 thư mục
		File d1 = new File("F:\\HT");
		d1.mkdir();
		// phương thức mkdirs() => tạo nhieu thư mục
		File d2 = new File("F:\\HT10\\HT1\\HT2");
		d2.mkdirs();
		// tạo tập tin
		File d3 = new File("F:\\HT10\\ht.txt");
		try {
			d3.createNewFile();
		} catch (IOException e) {
			// không có quyền tạo tập  tin
			// ổ cứng bị đầy
			// đường dẫn sai
			e.printStackTrace();
		}
	}
}
