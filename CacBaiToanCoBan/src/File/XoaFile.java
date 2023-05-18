package File;

import java.io.File;
import java.io.IOException;

public class XoaFile {
	public static void xoaFile(File f) {
		if(f.isFile()) {
			System.out.println("Da xoa: " + f.getAbsolutePath());
			f.delete();
		}else if(f.isDirectory()) {
			// lay cac file con
			File [] mangCon = f.listFiles();
			for(File file : mangCon) {
				// xóa các file con (đang dùng đệ qui)
				xoaFile(file);		
			}
			// xóa bản thân thư mục sau khi đã xóa các file con
			System.out.println("Da xoa : " + f.getAbsolutePath());
			f.delete();
		}
	}
	public static void main(String[] args) {
		File f = new File("F:\\HT2001");
		File f2 = new File("F:\\HT");
		File f3 = new File("F:\\HT2001\\vidu.txt");
		f.mkdir();
		f2.mkdir();
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f2.deleteOnExit(); // chỉ xóa được thư mục rỗng và 1 tập tin nhưng không thông báo kết quả
		System.out.println(f3.delete()); // xóa được hay không vẫn thông báo kết quả
		xoaFile(f);
		
		
	}
}
