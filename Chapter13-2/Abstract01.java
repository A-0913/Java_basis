import extend.animal.Dog;

public class Abstract01 {
  public static void main(String[] args) {

    // Dogクラス(=サブクラス)のインスタンスを生成する
    Dog dog = new Dog();

    // 抽象クラス（Animalクラス）のメソッドを呼び出す
    // 抽象クラスのメソッドやフィールドにアクセスする場合は、
    // 必ずサブクラスのインスタンスを生成してからアクセスする
    dog.eat();

    // 抽象メソッドを実装したメソッドを呼び出す（※Dogクラスでオーバーライト済み）
    dog.cry();

    // 抽象クラスはインスタンス生成することができないため、下記はコンパイルエラーになる
    // Animal animal = new Animal();
  }
}