package capsule.human;

public class Chapter12 {
  public static void main(String[] args) {

  　//CapsuleManインスタンスを作成（→コンストラクタ実行）
    CapsuleMan man = new CapsuleMan("小林", 32);

    // getnameメソッドで変数nameを取得する
    System.out.println("名前は" + man.getName() +  "です。");

    // getAgeメソッドで変数ageを取得する
    System.out.println("年齢は" + man.getAge() + "です。");

    // setAgeメソッドで変数ageを更新する
    man.setAge(33);

    // setAgeメソッドで変更された変数ageをgetAgeメソッドで取得する
    System.out.println("誕生日を迎えたので、年齢が" + man.getAge() + "になりました。");

  }
}
