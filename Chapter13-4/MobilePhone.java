// 抽象クラスと同じようにインターフェースもインスタンス生成することはできない

// Phone, Cameraインターフェースを実装したMobilePhoneクラスの宣言
//インターフェースを実装する場合は、クラス名の後ろに「implements インターフェース名」を記述する
public class MobilePhone implements Phone, Camera {
  private String number;

  public MobilePhone(String number) {
     this.number = number;
  }

// Cameraインターフェースのメソッドを実装
// 実装したインターフェースの抽象メソッドを実装する必要があり、実装されていない場合は、コンパイルエラーになる
  public void takePicture() {
    System.out.println("写真をとります。");
  }

// Phoneインターフェースのメソッドを実装
// 実装したインターフェースの抽象メソッドを実装する必要があり、実装されていない場合は、コンパイルエラーになる
  public void call(String number) {
    System.out.println(this.number + " から " + number + " に電話をかけます。");
  }
}
