public class Main {
  public static void main(String[] args) {
    long l = 92233720L;
    //「long」型を使用する場合は数値の最後に「L」を付ける
    System.out.println(l);

    double d = 0.3;
    System.out.println(d);

    boolean b = true;
    System.out.println(b);

    Float f = 0.0f;
    //「float」型を宣言する場合は、数値の最後に「F」または「f」を付ける
    System.out.println(f);

    Integer i = 4;
    System.out.println(i);

    Character c = 'あ';
    //「char」型は１つの変数に格納できるのは１文字だけ
    System.out.println(c);

    int[] array = new int[] {10, 20, 30, 40, 50};
    System.out.println(array[3]);
  }
}