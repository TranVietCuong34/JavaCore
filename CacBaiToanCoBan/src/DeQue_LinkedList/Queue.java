package DeQue_LinkedList;

import java.util.LinkedList;

import javax.management.Query;

public class Queue {
	public static void main(String[] args) {
		// queue vào trước ra trước không sắp xếp
		java.util.Queue<String> danhSachSvQueue = new LinkedList<String>();
		
		// thêm vào
		danhSachSvQueue.offer("Cuong");
		danhSachSvQueue.offer("Cuong1");
		danhSachSvQueue.offer("Cuong2");
		
		while(true) {
			// lấy giá trị và xóa
			String ten = danhSachSvQueue.poll();
			
			//lấy giá trị và không xóa
//			String ten = danhSachSvQueue.peek();
			if(ten==null)
				break;
			System.out.println(ten);
		}
	}
}
