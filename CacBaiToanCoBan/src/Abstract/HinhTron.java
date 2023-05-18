package Abstract;

public class HinhTron  extends Hinh{
	private int r;

	public HinhTron(ToaDo toaDo, int r) {
		super(toaDo);
		this.r = r;
	}

	@Override
	public double tinhDT() {
		return this.r*r*Math.PI;
	}
	
}
