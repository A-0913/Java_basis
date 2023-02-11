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

  // nameのgetterメソッド:private になっているフィールド変数nameを取得するためのもの
  public String getName() {
    return this.name;
  }

  // nameのsetterメソッド:private になっているフィールド変数ageを変更するためのもの
  public int getAge() {
    return this.age;
  }

  // ageのgetterメソッド:private になっているフィールド変数ageを取得するためのもの
  public void setAge(int age) {
    this.age = age;
  }
}


/* 【getter/setter】
  フィールドにアクセス制限を「private」にすることで、
  他のプログラムによる直接の変更を禁止できるようになるが、  同時に値の取得もできなくなってしまう。
  そのため、フィールドの値を取得するための「getter」メソッドや
  値を変更するための「setter」メソッドを必要に応じて作成して、他のプログラムから参照できるようにする。

  【基本構文】
    getterメソッド
      public 戻り値の型(フィールドの型)  getフィールド名() {
        return this.フィールド名
      }

    setterメソッド
      public void setフィールド名(フィールドの型の引数) {
        this.フィールド名 = フィールドの型の引数;
      }
*/