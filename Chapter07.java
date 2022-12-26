public class Chapter07 {
	public static void main(String[] args) {
		int km = 5;
		if (km <= 5) {
			System.out.println("とても近いです");
		} else if (km <= 10) {
			System.out.println("近いです");
		} else if (km <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
	}
}