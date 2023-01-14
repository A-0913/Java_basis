package extend;

// Phoneインターフェースの宣言
// インターフェースに指定できるアクセス修飾子は「public」か「package-private（何も書かない）」だけ
public interface Phone {

  // フィールドの宣言（定数）
  //(public static final) 定数の型 定数名 = 初期値;
  int MAX_NUMBER_DIGITS = 11;

　// public abstractが自動で追加され、public abstract call(String number);に変換される。
  public void call(String number);

  // defaultメソッドの宣言
  default void powerOff() {
    System.out.println("電源を切ります。");
  }
}
