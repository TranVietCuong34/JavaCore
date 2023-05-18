package KeThua_abstract;

public class HangSX {
	private String tenHangSx,tenQG;

	public String getTenHangSx() {
		return tenHangSx;
	}

	public void setTenHangSx(String tenHangSx) {
		this.tenHangSx = tenHangSx;
	}

	public String getTenQG() {
		return tenQG;
	}

	public void setTenQG(String tenQG) {
		this.tenQG = tenQG;
	}

	public HangSX(String tenHangSx, String tenQG) {
		super();
		this.tenHangSx = tenHangSx;
		this.tenQG = tenQG;
	}
}
