public class Main {
	public static void main(String[] args) {
		int i = 10;

		if(i <= 5){
			System.out.println("とても近いです");
		}else if(i <= 10){
			System.out.println("近いです");
		}else if(i <= 15){
			System.out.println("遠いです");
		}else{
			System.out.println("とても遠いです");
		}
	}
}