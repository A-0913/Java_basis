//abstract修飾子を設定して、抽象クラスとして宣言する
public abstract class Animal {
  protected String name;

  // public→どこからでもアクセス可能
  public void eat() {
    System.out.println(name + "が食事をしました！");
  }

  // サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
  // 継承したサブクラスにてオーバーライドしないとコンパイルエラーになる
  public abstract void cry();
}