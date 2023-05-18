package DeQue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
	public static void main(String[] args) {
		// queue vào trước ra trước có sắp xếp
		Queue<String> danhSachSvQueue = new java.util.PriorityQueue<String>();
		
		// thêm vào
		danhSachSvQueue.offer("Cuong");
		danhSachSvQueue.offer("A");
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
