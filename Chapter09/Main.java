package practice;

public class Main {
    public static void main(String[] args) {
        // 燃費（Km/L）
        double fuelCost = 12.5;
        // 残量（L）
        double fuelAmount = 55.0;
        // Carインスタンスを生成する(→コンストラクタ実行)
        Car car = new Car(fuelCost, fuelAmount);

        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
    }
}