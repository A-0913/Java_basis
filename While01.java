public class While01 {
    public static void main(String[] args) {
        int number = 1;
        while (number < 50) {
            number *= 2;  //変数1に右のオペランド2の値を乗算し、結果を変数に代入
            System.out.println("While01 = " + number);
        }
    }
}