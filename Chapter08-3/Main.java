public class Main {
  public static void main(String[] args) {
    int[] array = { 10, 25, 40, 59 };
    for(int number : array){
      if(number % 2 == 0){
        continue;
      }
      System.out.println(number);
    }
  }
}