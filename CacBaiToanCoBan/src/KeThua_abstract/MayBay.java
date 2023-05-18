package KeThua_abstract;

public class MayBay extends PhuongTienDichuyen {
	private String loaiNhieuLieu;

	public MayBay(String loaiPhuongTien, HangSX hangSX, String loaiNhieuLieu) {
		super(loaiPhuongTien, hangSX);
		this.loaiNhieuLieu = loaiNhieuLieu;
	}

	public String getLoaiNhieuLieu() {
		return loaiNhieuLieu;
	}

	public void setLoaiNhieuLieu(String loaiNhieuLieu) {
		this.loaiNhieuLieu = loaiNhieuLieu;
	}

	@Override
	public double layVanToc() {
		return 100;
	}
	
}
