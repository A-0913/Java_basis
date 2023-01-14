package extend;

import extend.MobilePhone;
import extend.Phone;

public class Chapter13 {
  public static void main(String[] args) {
    // MobilePhoneインスタンスを生成
    MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
    mobilePhone.takePicture();

    // staticCallメソッドの呼び出し
    // Phoneインターフェースのcallメソッドを参照→MobilePhoneクラスのcallメソッドを実行
    Chapter13.staticCall(mobilePhone, "99-8888-7777");
    mobilePhone.powerOff();

    // flyingPhoneインスタンスを生成
    FlyingPhone flyingPhone = new FlyingPhone(5);
    flyingPhone.fly();

    // staticCallメソッドの呼び出し
    // Phoneインターフェースのcallメソッドを参照→FlyingPhoneクラスのcallメソッドを実行
    Chapter13.staticCall(flyingPhone, "000-1111-2222");

    //defaultメソッドがFlying および Phone （＝同じ階層どうし）から継承されているため、
    //FlyingPhone.javaで明示的にどちらのdefaultメソッドを使用するかを記述する必要がある。
    flyingPhone.powerOff();
  }

  public static void staticCall(Phone phone, String number) {
    // Phoneインターフェースのcallメソッドを参照
    // アップキャストされた変数のメソッドを呼び出し
    // アップキャスト:スーパークラスのオブジェクトにサブクラスのインスタンスを格納すること
    phone.call(number);
  }
}
