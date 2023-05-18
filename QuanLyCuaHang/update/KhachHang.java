package Class.day10_ArrayList.QuanLyCuaHang.update;

public class KhachHang {
	private int ID;
	private String name;
	
	public void display() {
		System.out.printf("%8d %-25s%n",this.ID,this.name);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public KhachHang(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public KhachHang() {
		super();
	}
	
}
