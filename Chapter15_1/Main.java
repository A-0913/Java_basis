public class Main {
  public static void main(String[] args) {
    int a = 976;
    int b = 427;
    System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
  }

  // ユークリッドの互除法で最大公約数を計算するメソッド
  // 引数で持ってきた2つの値を b が 0になるまで再帰的に余剰を求め続ける
  static int gcd(int a, int b) {
    // b が 0の場合
    if (b == 0){
      // aの値（61）を返す
      return a;
      }else{
        // if文がfalseの場合に「return gcd(b, a % b);」で自分自身を呼び出す（再帰呼び出し）
        return gcd(b, a % b);
      }
  }
}

// 例）最大公約数の求め方
// 1.大きい数（976）を小さい数（427）で割る
// 2.割った数（427）を余り（122）で割る
// 3.さらに割った数（122）を余り（61）で割る
// 4.さらに計算して、余りが0になった時の割った数（61）が最大公約数