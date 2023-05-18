package Class.day10_ArrayList.QuanLyCuaHang.qlbh;

import Class.day10_ArrayList.QuanLyCuaHang.update.*;

public class Hang {
	private int ID;
	private double amount;
	
	public void display() {
		HangHoa x = QuanLyHangHoa.getHangHoa(this.ID);
		System.out.printf("%-25s %8.1f %,12.2f %14.2f%n", x.getName(), this.amount, x.getPrice(), this.amount*x.getPrice());
	}
	
	public double thanhTien() {
		HangHoa x = QuanLyHangHoa.getHangHoa(this.ID);
		return this.amount * x.getPrice();
	}
	
	public Hang(int iD, double amount) {
		super();
		ID = iD;
		this.amount = amount;
	}
	public Hang() {
		super();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
