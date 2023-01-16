package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
  public static void main(String[] args) {
    try {
      // 1.readFileメソッドを実行
      Exception04.readFile("exception.txt");
      // ※呼び出し元も例外処理を記述しないとコンパイルエラーになる
    } catch (FileNotFoundException e) {
      // 3.例外処理が実行される
      System.out.println("FileNotFoundException例外が発生");
    }
    // 4.catch文で例外処理されるので、処理が実行される
    System.out.println("プログラム終了");
  }

  // readFileメソッド
  // throws:プログラムに例外が生じた際に、呼び出し元に例外処理を投げられる方法
  public static void readFile(String fileName) throws FileNotFoundException {
    System.out.println("ファイルの読み込み開始");
    // 2.ファイルが存在しないため例外が発生
    FileReader fr = new FileReader(fileName);
    System.out.println(fileName + "の読み込み完了");
  }
}