package QuanLySach;

public class TacGia {
	private String tenTacGia;
	private Ngay ngay;
	public TacGia(String tenTacGia, Ngay ngay) {
		super();
		this.tenTacGia = tenTacGia;
		this.ngay = ngay;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public Ngay getNgay() {
		return ngay;
	}
	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}
	
}
