package Info;

public class MonHoc {
	private int maMH;
	private String TenMH;
	private double heSoMH;
	
	public void display() {
		System.out.printf("%-15d %-12s %6.1f%n",this.maMH, this.TenMH,this.heSoMH);
	}
	
	
	public MonHoc(int maMH, String tenMH, int heSoMH) {
		this.maMH = maMH;
		TenMH = tenMH;
		this.heSoMH = heSoMH;
	}
	public MonHoc() {
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return TenMH;
	}
	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}
	public double getHeSoMH() {
		return heSoMH;
	}
	public void setHeSoMH(int heSoMH) {
		this.heSoMH = heSoMH;
	}
	
}
