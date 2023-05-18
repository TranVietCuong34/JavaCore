package Class.day10_ArrayList.QuanLyCuaHang.qlbh;

import java.util.Scanner;

import Class.day10_ArrayList.QuanLyCuaHang.update.HangHoa;
import Class.day10_ArrayList.QuanLyCuaHang.update.KhachHang;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyHangHoa;
import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyKhachHang;

public class QuanLyBanHang {
	
	static Scanner sc = new Scanner(System.in);
	static int autoNumber = 10001;
	
	public static void quanLyBanHang() {
		GioHang gio = new GioHang();
		do {
			System.out.println("\n------Chào mừng bạn đến cửa hàng----------");
			System.out.println("Hay chọn chức năng mua hàng");
			System.out.println("\t1. Thêm hàng vào giỏ");
			System.out.println("\t2. Sửa hàng vào giỏ");
			System.out.println("\t3. Xóa hàng khỏi giỏ");
			System.out.println("\t4. Xem hàng vào giỏ");
			System.out.println("\t5. Xóa giỏ hàng");
			System.out.println("\t6. Thanh toán giỏ hàng");
			System.out.println("\t0. Quay lại");
			
			System.out.println("Lựa chọn của bạn: ");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1: them(gio); break;
			case 2: sua(gio); break;
			case 3: xoa(gio); break;
			case 4: xem(gio); break;
			case 5: xoaHet(gio); break;
			case 6: 
				thanhToan(gio); 
				//Lưu giỏ hàng đã thanh toán vào danh sách giỏ hàng
				
				return;
			case 0: return;
			default: System.out.println("Lựa chọn k hợp lệ");
			}
		}while(true);
	}

	private static void them(GioHang gio) {
		// TODO Auto-generated method stub
		System.out.println("\n----------THÊM HÀNG VÀO GIỎ---------------");
		//Có 2 trường hợp: 1. Hàng mới chưa có trong giỏ;	2. Hàng đã có trong giỏ
		//Ràng buộc: Hàng phải có trog ds hag hóa; Số lượng mua <= số lượng có trog ds
		System.out.println("Nhập ID hàng hóa: ");
		int id = Integer.parseInt(sc.nextLine());
		//Ktra xem nó có trog ds hàng hóa
		int indexHang = QuanLyHangHoa.findByID(id);
		if(indexHang == -1) {
			System.out.println("Hàng hóa k có trog ds");
			return;
		}
		System.out.print("Số lượng cần mua: ");
		double amount = Double.parseDouble(sc.nextLine());
		//Ktra hag có trog giỏ chưa
		int indexGio = gio.findHang(id);
		if(indexGio != -1) {
			//Hàng đã có trog giỏ: cộng số lượng thêm với số lượng đã có
			amount += gio.getList().get(indexGio).getAmount();
		}
		//Ktra xem số luog mua
		if(amount > QuanLyHangHoa.getList().get(indexHang).getAmount()) {
			System.out.println("Số lượng bán k đủ");
			return;
		}
		//KT hag có trog giỏ chưa
		if(indexGio == -1) {//Chưa có
			Hang hang = new Hang(id,amount);
			gio.getList().add(hang);
		}
		else {//Đã có, chỉ cần đặt lại số lg
			gio.getList().get(indexGio).setAmount(amount);
		}
		System.out.println("Thêm hàng vào giỏ thành công !");
	}

	private static void sua(GioHang gio) {
		// TODO Auto-generated method stub
		System.out.println("\n-----SUA HANG TROG GIO---------");
		System.out.print("\tNhap ID hang cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		//Ktra hag có trg giỏ k
		int indexGio = gio.findHang(id);
		if(indexGio == -1) {
			System.out.println("\t Hag k có trog giỏ");
			return;
		}
		System.out.print("\t Nhập số lượng mới: ");
		double amount = Double.parseDouble(sc.nextLine());
		if(amount <= 0) {
			System.out.println("\t Số lượng mua phải lớn hơn k");
			return;
		}
		//KT xem có số lượng mới có vượt qua số lượng có bán k?
		HangHoa x = QuanLyHangHoa.getHangHoa(id);
		if(x==null) {
			return;
		}
		//Đặt lại số lượng mua
		gio.getList().get(indexGio).setAmount(amount);
		System.out.println("\t Sửa hàng trong giỏ thành công!");
		
	}

	private static void xoa(GioHang gio) {
		// TODO Auto-generated method stub
		System.out.println("\n-----Xóa HANG TROG GIO---------");
		System.out.print("\tNhap ID hang cần xóa: ");
		int id = Integer.parseInt(sc.nextLine());
		//Ktra hag có trg giỏ k
		int indexGio = gio.findHang(id);
		if(indexGio == -1) {
			System.out.println("\t Hag k có trog giỏ");
			return;
		}
		gio.getList().remove(indexGio);
		System.out.println("\t Xóa hàng trog giỏ thành công");
	}

	private static void xem(GioHang gio) {
		// TODO Auto-generated method stub
		System.out.println("\t\tGIO HAG CỦA BẠN");
		gio.display();
	}

	private static void xoaHet(GioHang gio) {
		// TODO Auto-generated method stub
		gio.getList().clear();
		System.out.println("Đã xóa hết hàng trog giỏ");
	}

	private static void thanhToan(GioHang gio) {
		// TODO Auto-generated method stub
		if(gio.getList().size() == 0) {
			return;
		}
		System.out.println("\n-----------THANH TOÁN GIỎ HÀNG-------------");
		System.out.println("Nhập ID khách hàng: ");
		int idKhach = Integer.parseInt(sc.nextLine());
		//KT xem khách hàng có trong ds Khách hag chưa
		int indexKhach = QuanLyKhachHang.find(idKhach);
		if(indexKhach == -1) {//Khách hag chưa có trog ds Khách hàng
			//Nhập tên khách và thêm khách vào danh sách khách hàng
			String tenKhach = null;
			do {
				System.out.println("Nhập tên khách hàng mới: ");
				tenKhach = sc.nextLine();
			}while(tenKhach.trim().length()==0);
			idKhach = QuanLyKhachHang.autoNumber++;
			KhachHang khach = new KhachHang(idKhach,tenKhach);
			QuanLyKhachHang.getList().add(khach);
		}
		//Cap nhật lại giỏ hàng
		gio.setID(autoNumber++);
		gio.setID_Khach(idKhach);
		System.out.println("\t\tHOA ĐƠN THANH TOÁN GIỎ HÀNG");
		gio.display();
		System.out.println("\n Thanh toán giỏ hàng thành công");
		QuanLyGioHang.list.add(gio);//Lưu giỏ hàng vào ds giở hàng
	}
}
