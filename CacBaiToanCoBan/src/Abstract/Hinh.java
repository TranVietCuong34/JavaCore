package Abstract;

public abstract class Hinh {
	protected ToaDo toaDo;
	public abstract double tinhDT();
	public Hinh(ToaDo toaDo) {
		super();
		this.toaDo = toaDo;
	}
}
