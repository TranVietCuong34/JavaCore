package Class.day10_ArrayList.QuanLyCuaHang.update;

import java.util.Scanner;

public class HangHoa {
	
	private int ID;
	private int IDLH;
	private String name;
	private double amount;
	private double price;
	
	
	
	

	public int getID() {
		return ID;
	}





	public void setID(int iD) {
		ID = iD;
	}





	public int getIDLH() {
		return IDLH;
	}





	public void setIDLH(int iDLH) {
		IDLH = iDLH;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public double getAmount() {
		return amount;
	}





	public void setAmount(double amount) {
		this.amount = amount;
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}



	

	public HangHoa(int iD, int iDLH, String name, double amount, double price) {
		super();
		ID = iD;
		IDLH = iDLH;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}


	static Scanner sc = new Scanner(System.in);


	public HangHoa() {
		super();
	}
	
	public void display() {
		String tenLoaiHang = QuanLyLoaiHang.getName(IDLH);
		System.out.printf("%-7d %-25s %-25s %8.1f %13.2f%n",this.ID,tenLoaiHang,this.name,this.amount,this.price);
	}
	
	public void sua() {
		do {
			System.out.println("Chọn thông tin hàng hóa cần sửa: ");
			System.out.println("\t1. Sửa mã loại hàng (IDLH)");
			System.out.println("\t2. Sửa tên hàng hóa");
			System.out.println("\t3. Sửa số lượng hàng hóa");
			System.out.println("\t4. Sửa đơn giá hàng hóa");
			System.out.println("\t0. Quay lại ");
			int chon = Integer.parseInt(sc.nextLine());
			
			switch (chon) {
			case 1: suaMaLoaiHang();	break;
			case 2: suaTen(); 			break;
			case 3: suaSoLuong();		break;
			case 4: suaDonGia();		break;
			case 0:
				return;
			}
		}while(true);
	}



	private void suaMaLoaiHang() {
		// TODO Auto-generated method stub
		System.out.println("\n Sửa mã loại hàng");
		System.out.print("\t Nhập mã loại hàng mới: ");
		int idlh = Integer.parseInt(sc.nextLine());
		int index = QuanLyLoaiHang.find(idlh);
		if(index == -1) {
			System.out.println("\t Loại hàng này k có, cần tạo mới");
			return;
		}
		setIDLH(idlh);
	
	}
	
	





	private void suaTen() {
		// TODO Auto-generated method stub
		System.out.println("\n Sửa tên hàng hóa");
		System.out.print("\t Nhập tên hàng hóa mới: ");
		String name = sc.nextLine();
		if(name.trim().length()==0) {
			System.out.println("\t Tên hàng hóa k đc để trống");
			return;
		}
		setName(name);
	}





	private void suaSoLuong() {
		// TODO Auto-generated method stub
		System.out.println("\n Sửa số lượng hàng hóa");
		System.out.print("\t Nhập số lượng hàng hóa mới: ");
		double amount = Double.parseDouble(sc.nextLine());
		if(amount < 0) {
			System.out.println("\t Số lượng hàng hóa ko đc là số âm");
			return;
		}
		setAmount(amount);
		System.out.println("Sửa số lượng hàng hóa thành công");
	}





	private void suaDonGia() {
		// TODO Auto-generated method stub
		System.out.println("\n Sửa đơn giá hàng hóa");
		System.out.print("\t Nhập đơn giá hàng hóa mới: ");
		double price = Double.parseDouble(sc.nextLine());
		if(price < 0) {
			System.out.println("\t Đơn giá hàng hóa ko đc là số âm");
			return;
		}
		setPrice(price);
		System.out.println("Sửa đơn giá hàng hóa thành công");
	}
}
