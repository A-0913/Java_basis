package capsule.human;

public class CapsuleMan {

  // privateのアクセス修飾子を設定してカプセル化している
	private String name;
	private int age;

  // CapsuleManインスタンスのコンストラクタを設定
  public CapsuleMan(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // nameのgetterメソッド:private になっているフィールド変数を取得するためのもの
  public String getName() {
    return this.name;
  }

  // nameのsetterメソッド:private になっているフィールド変数を変更するためのもの
  public int getAge() {
    return this.age;
  }

  // ageのgetterメソッド:private になっているフィールド変数を取得するためのもの
  public void setAge(int age) {
    this.age = age;
  }
}
