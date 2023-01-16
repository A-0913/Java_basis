package exception;

public class Exception03 {
	public static void main(String[] args) {
    try {
      // 1.divisionメソッドを実行
      Exception03.division(100, 0);
      // ※例外クラスが一致しないので、例外処理が実行されない
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException例外が発生");
      // 3.IllegalArgumentExceptionクラスの例外処理が実行される
      // 例外の発生後は、このthrowステートメントに対応するcatch節に処理が移る
    } catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException例外が発生");
      // 4.キャッチした例外インスタンスをスロー
      throw e;
    }
    // ※finallyブロックでないので処理が実行されない
    System.out.println("プログラム終了");
	}

  // divisionメソッド
	public static void division(int a, int b) {
    System.out.println(a + " ÷ " + b + " は？");
    // 変数bの値が0と等しい時に必ずエラーにしたい
    if (b == 0) {
      // throwステートメント:「throw new 例外クラス」
      // 2.割り算で例外が発生するので、意図的にIllegalArgumentException例外をスロー
      throw new IllegalArgumentException("引数が不正です");
    }
    int result = a / b;
    System.out.println("計算結果" + result);
	}
}

//《throwの処理の流れ》
// 例外発生　→　例外インスタンス生成　→　例外のスロー　→　例外のキャッチ
