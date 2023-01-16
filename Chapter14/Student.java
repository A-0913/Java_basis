package polymorphism;

public class Student extends Human {
  private int score;

  // Studentクラスのコンストラクタ
  public Student(String name, int age, int score) {
    // スーパークラス(Human.java)のコンストラクタを呼び出し
    super(name, age);
    this.score = score;
  }

  // スーパークラス(Human.java)のgetProfileメソッドをオーバーライト
  public String getProfile() {
    String profile = "年齢は" + super.age + "です。";
    profile += "学生で、テストの点数は" + this.score + "点です。";
    return profile;
  }
}