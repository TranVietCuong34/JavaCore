package DeQue_LinkedList;

import java.util.ArrayDeque;
import java.util.Queue;

public class Deque {
	public static void main(String[] args) {
		// có 2 đầu vào và ra
		java.util.Deque<String> danhSachSv = new ArrayDeque<String>();
		danhSachSv.offer("Cuong");
		danhSachSv.offer("A");
		danhSachSv.offer("Cuong2");
		danhSachSv.offerFirst("hello");
		danhSachSv.offerLast("c");

		while (true) {
			// lấy giá trị và xóa
			String ten = danhSachSv.poll();

			// lấy giá trị và không xóa
//			String ten = danhSachSvQueue.peek();
			if (ten == null)
				break;
			System.out.println(ten);
		}

	}
}
