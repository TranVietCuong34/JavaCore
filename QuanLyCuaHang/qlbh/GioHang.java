package Class.day10_ArrayList.QuanLyCuaHang.qlbh;

import java.util.ArrayList;

import Class.day10_ArrayList.QuanLyCuaHang.update.QuanLyKhachHang;

public class GioHang {
	private int ID;
	private int ID_Khach;
	private ArrayList<Hang> list = new ArrayList<>();
	
	public GioHang(int iD, int iD_Khach, ArrayList<Hang> list) {
		super();
		ID = iD;
		ID_Khach = iD_Khach;
		this.list = list;
	}

	public void display() {
		System.out.println("\t Mã giỏ hàng: "+this.ID);
		System.out.println("\t Tên khách: "+QuanLyKhachHang.getName(ID_Khach));
		System.out.println("DS Hàng hóa");
		System.out.printf("%3s %-25s %8s %-12s %-14s%n","STT","Tên hàng hóa","Số lượng","Đơn giá","Thành tiền");
		double congTt = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%-3d",i+1);
			list.get(i).display();
			congTt += list.get(i).thanhTien();
		}
		System.out.printf("\t\t Cộng thành tiền: %,.2f%n",congTt);
	}
	
	public GioHang() {
		super();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getID_Khach() {
		return ID_Khach;
	}

	public void setID_Khach(int iD_Khach) {
		ID_Khach = iD_Khach;
	}

	public ArrayList<Hang> getList() {
		return list;
	}

	public void setList(ArrayList<Hang> list) {
		this.list = list;
	}
	
	public int findHang(int idHang) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getID() == idHang) {
				return i;
			}
		}
		return -1;
	}
	
}
