package practice;

import java.sql.SQLException;

public class Chapter10 {
  public static void main(String[] args) {

    try {
        int array[] = { 1, 3, 5 };
        // 1.validIndexメソッドを実行
        Chapter10.validIndex(array, 2);
        // 3.validIndexメソッドを実行
        Chapter10.validIndex(array, 3);

        // Exceptionが発生しない場合は出力される
        System.out.println("validIndexの呼び出し終了");
        // 5.IllegalArgumentExceptionをキャッチして、
    } catch (IllegalArgumentException e) {
        // 6.メッセージと
        System.out.println("IllegalArgumentExceptionが発生しました");
        // 7.スタックトレースを出力
        // ※スタックトレース:実行結果で表示される「at practice.Chapter10 ・・・」以降の行で、
        // 　例外が発生するまでにメソッドがどのような順序で呼び出されているかが記録されたもの
        // ※例外クラスには、「printStackTrace()」メソッドが用意されているため、
        // 　Javaのプログラム内で出力することができる。
        e.printStackTrace();
    }

    // try-catch文を記述
    try {
      // 8.throwSQLExceptionメソッドを実行
    	Chapter10.throwSQLException();
    	// 10.SQLExceptionをキャッチして、
    } catch (SQLException e){
        // 11.メッセージと
        System.out.println("throwSQLException例外が発生");
        // 12.スタックトレースを出力
        // ※例外クラスには、「printStackTrace()」メソッドが用意されているため、
        // 　Javaのプログラム内で出力することができる。
        e.printStackTrace();
    } finally {
      // 13."throwSQLExceptionの呼び出し終了"のメッセージを出力
    	System.out.println("throwSQLExceptionの呼び出し終了");
    }
    // 14.catch文で例外処理されるので、処理が実行される
    System.out.println("mainメソッド終了");

  }


  public static void validIndex(int[] array, int index) {
    // ・indexがarrayのサイズの範囲内なら、
  	if (index >= array.length) {
  	  // 4.index(3)がarrayのサイズ(3)の範囲外のためIllegalArgumentExceptionをスロー
  		throw new IllegalArgumentException(index + " はサイズの範囲外です");
  	}
  	// 2.index(2)がarrayのサイズ(3)の範囲内のため要素を出力
  	System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
  }

  // スローされる例外が検査例外なので、throws文が必要
  public static void throwSQLException() throws SQLException {
    // 9.例外インスタンスを生成してスロー
    // SQLExceptionは、通常、SQLでエラーの場合に発生する例外
    throw new SQLException("SQLエラーです");
  }
}
