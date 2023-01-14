package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
  public static void main(String[] args) {
    Human sugimoto = new Human("杉本", 16);　//Human(String name, int age)
    System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());

    Student sato = new Student("佐藤", 17, 70);　//Student(String name, int age, int score)
    System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
    System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

　　// Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数humanに代入
    Human human = new Employee("田中", 28, "システム部");　//Employee(String name, int age, String department)
    System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

　　// Employeeクラスの変数にダウンキャストして Employee型の変数tanakaに代入
    Employee tanaka = (Employee) human;　//明示的に変換先のデータ型を指定
    System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

    Extend01.printName(sugimoto);
　　// 以下2つはHumanクラスのサブクラスの変数を引数にして呼び出し
    Extend01.printName(sato);
    Extend01.printName(tanaka);
  }

　// 引数がHumanクラスなので、Humanクラスか、そのサブクラスなら呼び出しできる
  public static void printName(Human human) {
    System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
  }
}