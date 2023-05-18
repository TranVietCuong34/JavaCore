package KeThua_abstract;

public class XeOto extends PhuongTienDichuyen {
	private String loaiNhieuLieu;
	
	public XeOto(String loaiPhuongTien, HangSX hangSX, String loaiNhieuLieu) {
		super(loaiPhuongTien, hangSX);
		this.loaiNhieuLieu = loaiNhieuLieu;
	}

	@Override
	public double layVanToc() {		
		return 80;
	}
	
}
