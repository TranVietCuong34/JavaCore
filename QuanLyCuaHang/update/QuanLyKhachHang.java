package Class.day10_ArrayList.QuanLyCuaHang.update;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyKhachHang {

	public static int autoNumber = 101;

	private static ArrayList<KhachHang> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static ArrayList<KhachHang> getList() {
		return list;
	}

	public static void setList(ArrayList<KhachHang> list) {
		QuanLyKhachHang.list = list;
	}

	public static void init() {
		list.add(new KhachHang(autoNumber++, "Thùy Linh"));
		list.add(new KhachHang(autoNumber++, "Chí Dũng"));
		list.add(new KhachHang(autoNumber++, "Thị Quyên"));
	}

	public static void quanLyKhachHang() {
		QuanLyKhachHang.init();
		QuanLyHangHoa.init();
		do {
			System.out.println("\n--------Cập nhật TT khách hang---------");
			System.out.println("Chọn chức năng cập nhật");
			System.out.println("\t1. Xem danh sách khách hang");
			System.out.println("\t2. Thêm khách hang mới");
			System.out.println("\t3. Sửa thông tin khách hang");
			System.out.println("\t4. Xóa khách hang");
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
		System.out.println("\n --------XÓA THONG TIN KHÁCH HÀNG------");
		System.out.print("\t Nhập id của khách hang cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		//
		int index = find(id);
		if (index == -1) {
			System.out.println("\t khách hang ko có trog ds");
			return;
		}
		// Xử lý ràng buộc: Khách hàng đã mua và có giỏ hàng thì k thể xóa

		list.remove(index);
		System.out.println("\t Xóa khách hang ");
	}

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("\n --------SUA THONG TIN KHÁCH HÀNG------");
		System.out.print("\t Nhập id của khách hang cần sửa: ");
		int id = Integer.parseInt(sc.nextLine());
		//
		int index = find(id);
		if (index == -1) {
			System.out.println("\t khách hang ko có trog ds");
			return;
		}
		// Có
		System.out.print("\t Nhập tên khách hang mới: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {// Tên không đc bỏ trống
			System.out.println("\t Tên khách hang ko đc để trống");
			return;
		}
		list.get(index).setName(name);
		System.out.println("\t Sửa thông tin khách hang TC");
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("\n----------THEM KHÁCH HÀNG MOI-------------");
		System.out.print("\t Nhập tên khách hang mới: ");
		String name = sc.nextLine();
		if (name.trim().length() == 0) {// Tên không đc bỏ trống
			System.out.println("\t Tên khách hang ko đc để trống");
			return;
		}
		// Tạo đối tượng ms
		KhachHang newKhachHang = new KhachHang(autoNumber++, name);
		list.add(newKhachHang);
		System.out.println("\t Thêm khách hang mới thành công");

	}

	private static void xem() {
		// TODO Auto-generated method stub
		System.out.println("\n---------DANH SACH KHÁCH HÀNG--------");
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
		Collections.sort(list, new Comparator<KhachHang>() {

			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}

		});
	}

	public static String getName(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getID() == id) {
				return list.get(i).getName();
			}
		}
		return null;
	}

}
