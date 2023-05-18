package MyDate;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public Date() {

	}

	public void printDay() {
		System.out.println("Ngay: " + this.day);
	}

	public void printMonth() {
		System.out.println("Thang: " + this.month);
	}

	public void printYear() {
		System.out.println("Nam: " + this.year);
	}

	public void printDate() {
		System.out.println("Date: " + this.day + this.month + this.year);
	}

	public static void main(String[] args) {
		Date date = new Date(3, 4, 2001);
		date.printDay();
		date.printMonth();
		date.printYear();
		date.printDate();

	}
}
