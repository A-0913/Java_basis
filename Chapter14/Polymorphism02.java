public class Polymorphism02 {

  public static void main(String[] args) {
    // スーパークラス（Humanクラス）の変数にインスタンスを代入
    Human human = new Student("佐藤", 17, 70);

    // Polymorphism02インスタンスを生成
    Polymorphism02 polymorphism = new Polymorphism02();

    // printNameメソッド（引数なし）の呼び出し
    polymorphism.printName();
    // printNameメソッド（引数がStringクラス）の呼び出し
    polymorphism.printName("松本");
    // printNameメソッド（引数がStringクラスとStringクラス）の呼び出し
    polymorphism.printName("松本", "清水");
    // printNameメソッド（引数がHumanクラス）の呼び出し
    polymorphism.printName(human);
  }

  public void printName() {
    System.out.println("中川です。");
  }
  // 出力結果:中川です。

  public void printName(String name) {
    System.out.println(name + "です。");
  }
  // 出力結果:松本です。

  public void printName(String name1, String name2) {
    System.out.println(name1 + "と" + name2 + "です。");
  }
  // 出力結果:松本と清水です。

  public void printName(Human human) {
    System.out.println(human.getName() + "です。");
  }
  // 出力結果:佐藤です。
}

/*オーバーロードとは？

  引数の型、数、並び順のいずれかが異なる同じ名前のメソッドを１つのクラスに複数定義すること。
  同じ処理のメソッドを同じメソッド名で定義できるため、ソースコードがわかりやすくできる。

*/