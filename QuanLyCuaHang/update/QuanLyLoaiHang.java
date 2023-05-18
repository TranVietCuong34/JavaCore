package Class.day10_ArrayList.QuanLyCuaHang.update;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyLoaiHang {

	private static int autoNumber = 101;

	private static ArrayList<LoaiHang> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static ArrayList<LoaiHang> getList() {
		return list;
	}

	public static void setList(ArrayList<LoaiHang> list) {
		QuanLyLoaiHang.list = list;
	}

	public static void init() {
		list.add(new LoaiHang(autoNumber++, "Điện tử"));
		list.add(new LoaiHang(autoNumber++, "Thời trang"));
		list.add(new LoaiHang(autoNumber++, "Gia dụng"));
	}

	public static void quanLyLoaiHang() {
		QuanLyLoaiHang.init();
		QuanLyHangHoa.init();
		do {
			System.out.println("\n--------Cập nhật TT loại hàng---------");
			System.out.println("Chọn chức năng cập nhật");
			System.out.println("\t1. Xem danh sách loại hàng");
			System.out.println("\t2. Thêm loại hàng mới");
			System.out.println("\t3. Sửa thông tin loại hàng");
			System.out.println("\t4. Xóa loại hàng");
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


	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("\n --------XÓA THONG TIN LOAI HANG------");
		System.out.print("\t Nhập id của loại hàng cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		//
		int index = find(id);
		if (index == -1) {
			System.out.println("\t Loại hàng ko có trog ds");
			return;
		}
		if(QuanLyHangHoa.findIDLH(id)!=-1) {
			System.out.println("\t Loại hàng đã có ràng buộc  với danh sách hàng hóa, không thể xóa");
			return;
		}
		list.remove(index);
		System.out.println("\t Xóa loại hàng ");
	}

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("\n --------SUA THONG TIN LOAI HANG------");
		System.out.print("\t Nhập id của loại hàng cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		//
		int index = find(id);
		if (index == -1) {
			System.out.println("\t Loại hàng ko có trog ds");
			return;
		}
		// Có
		System.out.print("\t Nhập tên loại hàng mới: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {// Tên không đc bỏ trống
			System.out.println("\t Tên loại hàng ko đc để trống");
			return;
		}
		// Ktra tên ko trùg vs tên loại hàng dã có trong danh sách
		if (find(name) != -1) {
			System.out.println("\t Tên đã có trog ds, xin nhập tên khác");
			return;
		}
		list.get(index).setName(name);
		System.out.println("\t Sửa thông tin loại hàng TC");
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("\n----------THEM LOAI HANG MOI-------------");
		System.out.print("\t Nhập tên loại hàng mới: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {// Tên không đc bỏ trống
			System.out.println("\t Tên loại hàng ko đc để trống");
			return;
		}
		// Ktra tên ko trùg vs tên loại hàng dã có trong danh sách
		if (find(name) != -1) {
			System.out.println("\t Tên đã có trog ds, xin nhập tên khác");
			return;
		}
		// Tạo đối tượng ms
		LoaiHang newLoaiHang = new LoaiHang(autoNumber++, name);
		list.add(newLoaiHang);
		System.out.println("\t Thêm loại hàng mới thành công");

	}

	private static void xem() {
		// TODO Auto-generated method stub
		System.out.println("\n---------DANH SACH LOAI HANG--------");
		System.out.printf("%3s %-8s %-30s%n", "STT", "Ma LH", "Ten loai hàng");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%-3d", i + 1);
			list.get(i).display();
		}
	}

	// Các hàm phục vụ
	// Hàm tìm kiếm theo tên trong danh sách
	public static int find(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().compareToIgnoreCase(name) == 0) {
				return i;
			}
		}
		return -1;
	}

	// Hàm tìm kiếm theo id trong danh sách
	public static int find(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public static void sap() {
		Collections.sort(list,new Comparator<LoaiHang>(){

			@Override
			public int compare(LoaiHang o1, LoaiHang o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		
		});
	}
	public static String getName(int id) {
		for(int i = 0; i < list.size(); i ++) {
			if(list.get(i).getID()==id) {
				return list.get(i).getName();
			}
		}
		return null;
	}
}
