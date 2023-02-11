package practice;

public class Car {
  // 燃費（Km/L）
  private double fuelCost;
  // 残量（L）
  private double fuelAmount;

  // コンストラクタを作成
  public Car(double fuelCost, double fuelAmount){
    //クラスフィールドに値を設定
     this.fuelCost = fuelCost;
     this.fuelAmount = fuelAmount;
  }
  // moveメソッド
  // Main.javaにて引数[20]を受け取っているため、int型で引数を受け取るmoveメソッドを定義する
  public void move(int distance){
    // "xx km 走ります"を出力
    System.out.println( distance + "km 走ります");
    // 残量を計算
    this.fuelAmount -= (distance / fuelCost);
  }

  // fuelAmountを取得するメソッド
  // 変数FuelAmountのアクセス修飾子が[private]であるため、Main.javaから取得できるようにする
  public double getFuelAmount(){
    return this.FuelAmount;
  }
}