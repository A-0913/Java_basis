package practice;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            int array[] = { 1, 3, 5 };
            Main.validIndex(array, 2);
            Main.validIndex(array, 3);

            System.out.println("validIndexの呼び出し終了");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentExceptionが発生しました");
            e.printStackTrace();
        }

        // try-catch文を記述
          try {
            // ・throwSQLExceptionメソッドを呼び出し
            Main.throwSQLException();
          } catch (SQLException s){
            // ・SQLExceptionをキャッチして、
            System.out.println("SQLExceptionが発生しました");
            // ・メッセージとスタックトレースを出力
            s.printStackTrace();
          } finally {
            // ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
            System.out.println("throwSQLExceptionの呼び出し終了");
          }


        System.out.println("mainメソッド終了");
    }

    // ・validIndexメソッドを作成
    public static void validIndex(int[] array, int index) {
    // ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
      if (array.length <= index) {
          // ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
          throw new IllegalArgumentException(index + " はサイズの範囲外です");
      }
      System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
    }

    public static void throwSQLException() throws SQLException {
        throw new SQLException("SQLエラーです");
    }
}