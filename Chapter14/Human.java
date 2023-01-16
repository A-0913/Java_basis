package polymorphism;

public class Human {
  private String name;
  protected int age;

  // Humanクラスのコンストラクタ
  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getnameメソッドで変数nameを取得する
  final public String getName() {
    return this.name;
  }

  // getAgeメソッドで変数ageを取得する
  public int getAge() {
    return this.age;
  }

  public String getProfile() {
    return "名前は" + this.name + "、年齢は" + this.age + "です。";
  }
}