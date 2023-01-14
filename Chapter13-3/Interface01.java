package extend;

import extend.Camera;
import extend.MobilePhone;

public class Interface01 {
  public static void main(String[] args) {

  // MobilePhoneインスタンスを生成
    MobilePhone mobilePhone = new MobilePhone("000-1111-2222");

  // Phoneインターフェースのフィールド（定数 = 11）を参照
    System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");

  // Phoneインターフェースの抽象メソッドを実装したメソッドを呼び出し
    mobilePhone.call("99-8888-7777");

  // classTakePictureメソッドの呼び出し
    Interface01.classTakePicture(mobilePhone);
  }

  // Cameraインターフェースを実装したクラスは呼び出しできる
  public static void classTakePicture(Camera camera) {

  // アップキャストされた変数のメソッドを呼び出し
  // アップキャスト:スーパークラスのオブジェクトにサブクラスのインスタンスを格納すること
    camera.takePicture();
  }
}