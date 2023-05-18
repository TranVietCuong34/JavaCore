package Class.day10_ArrayList.QuanLyCuaHang.qlbh;

import java.util.ArrayList;

public class QuanLyGioHang {
	
	public static ArrayList<GioHang> list = new ArrayList<>();
	
	//Hien thị ds các giỏ hàng
	
	public static void hienThiDsCacGioHang() {
		for(GioHang x:list) {
			x.display();
			System.out.println("--------------------------------------");
		}
	}
	
	//Ham tìm kiếm hàng hóa theo id trog các giỏ hàng


	public static boolean timHang(int id) {
		// TODO Auto-generated method stub
		for(GioHang x:list) {
			for(Hang y: x.getList()) {
				if(y.getID()==id) {
					return true;
				}
			}
		}
		return false;
	}
	
	//Hàm tìm kiếm theo id giỏ hàng
	public static int findByIdGio(int id) {
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getID() == id) {
				return i;
			}
		
		}
		return -1;
	}
	//Hàm tìm kiếm theo id KH
	public static ArrayList<GioHang> findByIdKhach(int idKhach){
		ArrayList<GioHang> ls = new ArrayList<>();
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getID_Khach()==idKhach) {
				ls.add(list.get(i));
			}
		}
		return ls;
	}
	
}
