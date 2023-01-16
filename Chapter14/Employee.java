package polymorphism;

public class Employee extends Human {
  private String department;

  // Employeeクラスのコンストラクタ
  public Employee(String name, int age, String department) {
    // スーパークラス(Human.java)のコンストラクタを呼び出し
    super(name, age);
    this.department = department;
  }

  // スーパークラス(Human.java)のgetProfileメソッドをオーバーライト
  public String getProfile() {
    String profile = "年齢は" + this.age + "です。";
    profile += "サラリーマンで、部署は" + this.department + "です。";
    return profile;
  }
}