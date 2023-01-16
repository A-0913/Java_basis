package polymorphism;

import polymorphism.human;
import polymorphism.human;
import polymorphism.human;

public class Polymorphism01 {
  public static void main(String[] args) {
    // 1.Studentクラスのインスタンスを生成して、Humanクラスの変数human1に代入
    // ※Student(String name, int age, int score)
    Human human1 = new Student("佐藤", 17, 70);
    // 2.オーバーライドしているので、Studentクラスのメソッドが実行される
    System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human1.getProfile());

    // 3.Employeeクラスのインスタンスを生成して、Humanクラスの変数human2に代入
    // ※Employee(String name, int age, String department)
    Human human2 = new Employee("田中", 28, "システム部");
    // 4.オーバーライドしているので、Employeeクラスのメソッドが実行される
    System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human2.getProfile());
  }
}

//《出力結果》
// Humanクラスのメソッド：プロフィールを紹介します。年齢は17です。学生で、テストの点数は70点です。
// Humanクラスのメソッド：プロフィールを紹介します。年齢は28です。サラリーマンで、部署はシステム部です。

// オーバーライド:スーパークラスのメソッドをサブクラスで上書きして再定義すること
// オーバーライドするメソッド(サブクラス側)とされるメソッド(スーパークラス側)は、
// 次の条件をすべて満たしている必要がある

// (1)メソッド名が同じである(→getProfile)
// (2)引数の型と数が同じである(→getProfileに引数なし)
// (3)戻り値の型が同じか、スーパークラス・サブクラスの関係にある(→getProfileに戻り値なし)
// (4)例外の型が同じか、スーパークラス・サブクラスの関係にある(→getProfileに例外なし)
// (5)アクセス修飾子が同じか、スーパークラスの制約の方が厳しい(→getProfileのアクセス修飾子はすべてpublic)