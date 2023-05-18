package Class.day10_ArrayList.QuanLyCuaHang.update;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Class.day10_ArrayList.QuanLyCuaHang.qlbh.QuanLyGioHang;

public class QuanLyHangHoa {
	
	public static int autoNumber = 1001;
	
	private static ArrayList<HangHoa> list = new ArrayList<>();
	
	static Scanner sc = new Scanner(System.in);

	public static ArrayList<HangHoa> getList() {
		return list;
	}

	public static void setList(ArrayList<HangHoa> list) {
		QuanLyHangHoa.list = list;
	}
	
	public static void init() {
		list.add(new HangHoa(autoNumber++, 101, "Tivi Sony", 20, 12000000));
		list.add(new HangHoa(autoNumber++, 101, "Tủ lạnh Sanyo", 30, 12000000));
		list.add(new HangHoa(autoNumber++, 102, "Quần bò nam", 200, 12000000));
		list.add(new HangHoa(autoNumber++, 102, "Áo khoác gió nữ", 320, 12000000));
		list.add(new HangHoa(autoNumber++, 103, "Nồi cơm điện", 55, 22000000));
	}
	
	public static void quanLyHangHoa() {
		QuanLyLoaiHang.init();
		QuanLyHangHoa.init();
		do {
			System.out.println("\n--------Cập nhật TT hàng hóa---------");
			System.out.println("Chọn chức năng cập nhật");
			System.out.println("\t1. Xem danh sách hàng hóa");
			System.out.println("\t2. Thêm  hàng hóa mới");
			System.out.println("\t3. Sửa thông tin  hàng hóa");
			System.out.println("\t4. Xóa  hàng hóa");
			System.out.println("\t5. Sắp xếp danh sách");
			System.out.println("\t0. Quay lại");

			System.out.print("Lựa chọn của bạn: ");
			int chon = Integer.parseInt(sc.nextLine());

			switch (chon) {
			case 1:

				xem();
				break;
			case 2:
				them();
				break;
			case 3:
				sua();
				break;
			case 4:
				xoa();
				break;
			case 5:
				sap();
				break;
			case 0:
				System.out.println("Đóng ứng dụng");
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ");
			}
		} while (true);
	}
	
	private static void xem() {
		// TODO Auto-generated method stub
		System.out.println("\n---------DANH SACH HANG HOA------------");
		System.out.printf("%3s %-7s %-25s %-25s %-8s %-13s%n","STT","Ma hang","Ten loại hàng","Tên hàng hóa","Số lương","Đơn giá bán");
		for(int i = 0; i < list.size();i++) {
			System.out.printf("%-3d",i+1);
			list.get(i).display();
		}
		
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("\n--------------THÊM HÀNG HÓA MỚI---------------");
		//Nhập vào các thông tin của hàng hóa mới
		System.out.print("Nhập (chọn) IDLH: ");
		int idlh = Integer.parseInt(sc.nextLine());
		if(QuanLyLoaiHang.find(idlh)==-1) {
			System.out.println("\tLoai hàng này chưa có cần tạo mới");
			return;
		}
		System.out.print("Nhập tên hàng hóa: ");
		String name = sc.nextLine();
		if(name.trim().length()==0) {
			System.out.println("\t Tên hàng hóa ko đc để trống");
			return;
		}
		System.out.println("\t Nhập đơn giá hàng hóa: ");
		double price = Double.parseDouble(sc.nextLine());
		if(price < 0) {
			System.out.println("\t Đơn giá k đc là số âm");
			return;
		}
		System.out.println("\t Nhập số lượng hàng hóa: ");
		double amount = Double.parseDouble(sc.nextLine());
		if(amount < 0) {
			System.out.println("\t Số lượng k đc là số âm");
			return;
		}
		HangHoa newHangHoa = new HangHoa(autoNumber++,idlh, name, amount, price);
		list.add(newHangHoa);
		System.out.println("\tThem hàng hóa mới thành công");
		
	}

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("\n---------SUA THONG TIN HÀNG HÓA-----------");
		System.out.print("\t Nhập mã (id) hàng hóa cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		int index = findByID(id);
		if(index == -1) {
			System.out.println("\t Hàng hóa này ko có rong ds");
			return;
		}
		list.get(index).sua();		
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("\n --------XÓA THONG TIN LOAI HANG------");
		System.out.print("\t Nhập id của loại hàng cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		//
		int index = findByID(id);
		if (index == -1) {
			System.out.println("\t Loại hàng ko có trog ds");
			return;
		}
		//Ktra hag hóa đã có ng mua, đã có trog ds giỏ hàng
		//Đc lưu trữ thì k đc xóa
		if(QuanLyGioHang.timHang(id)==true) {
			System.out.println("Ko thể xóa hàng, đã có KH mua hàng");
			return;
		}
		list.remove(index);
	}

	private static void sap() {
		// TODO Auto-generated method stub
		Collections.sort(list, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
	}

	//Hàm tìm kiếm theo mã (IDLH) của loại hàng
	public static int findIDLH(int idlh) {
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getIDLH()==idlh) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findByID(int id) {
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getID()==id) {
				return i;
			}
		}
		return -1;
	}
	
	//Hàm nhận vào id hàng trả về đối tượng hàng hóa
	public static HangHoa getHangHoa(int id) {
		for(HangHoa x : list) {
			if(x.getID() == id) {
				return x;
			}
		}
		return null;
	}
}
