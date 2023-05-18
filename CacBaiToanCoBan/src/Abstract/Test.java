package Abstract;

public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(1, 2);
		ToaDo td2 = new ToaDo(10, 20);
		ToaDo td3 = new ToaDo(15, 5);

		Diem diem1 = new Diem(td1);

		HinhTron hinhTron1 = new HinhTron(td1, 5);

		HinhChuNhat hcn1 = new HinhChuNhat(td1, 5, 10);

		System.out.println(diem1.tinhDT());
		System.out.println(hinhTron1.tinhDT());
		System.out.println(hcn1.tinhDT());

	}
}
