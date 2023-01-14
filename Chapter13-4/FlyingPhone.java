package extend;

import extend.Phone;

public class FlyingPhone implements Phone, Flying {
  // サブクラスで追加したフィールド
	private int time;

  // コンストラクタ。引数でメンバ変数を初期化
  public FlyingPhone(int time) {
    this.time = time;
  }

  // Flyingインターフェースのメソッドをオーバーライド
  public void fly() {
    System.out.println( time + " 分間、飛びます。");
  }

  // Phoneインターフェースのメソッドをオーバーライド
	public void call(String number) {
		System.out.println( number + "に電話します。通話できるのは飛んでいる間だけです。");
	}

  // インターフェースを実装したクラスからdefaultメソッドを呼び出す基本構文
  // 《インターフェース.super.デフォルトメソッド名();》
  public void powerOff() {
    Flying.super.powerOff();
  }
}
