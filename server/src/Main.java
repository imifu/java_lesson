import java.util.*;

public class Main {
  public static void main(String[] args) {

   System.out.println("Hello World!");

   System.out.println("Javaの勉強を初めて見ました。");

   System.out.println("これはechoみたいなものです。");

   //コメントの記載テスト（//の場合行末まで。）

   /*この中に記載した内容は全てコメントになります*/

   int age; //年齢を入れる箱
   age = 20;
   System.out.println(age);

   System.out.println("私は" + age + "歳です。");

   //データ型の種別について
   //整数の型であれば下記４つ

   byte b; b = 101;  //とても小さい変数
   short s; s = 3600;  //小さな変数
   int i; i = 21000000;  //普通の変数(基本的にはintを使用することが多い。)
   long l; l = 900000000;  //大きな変数

   System.out.println(i + b + s + l);

   //少数を扱う型は下記２つ

   float weight; weight  = 67.5F;  //曖昧でもよい少数
   double height; height = 171.2;  //普通の少数（基本的にはdoubleを使用する場合が多い）

   System.out.println(weight);
   System.out.println(height);
   /*
   上記のような形式を浮動小数点という。
   また、注意事項として、浮動小数点方式には真に厳密な計算ができないという弱点がある。
   その為、誤差が許されない厳密な計算を行う場合は上記データ型は使用しないこと。
   */

   //yesかnoかを収納できる型は下記の１つ

   boolean isError; isError = true;
   boolean result; result = false;

   //文字を扱う型は下記の２つ

   char zodiac; zodiac = '颯';  //一文字だけ収納できる
   String name; name = "なかむら";  //文字列を収納できる

   System.out.println(zodiac);
   System.out.println(name);
   /*
   charのような「文字」データを記述する場合は「''」で囲むのが基本です。
   Stringのような「文字列」データは「”」で囲むのが基本となる。
   */

  }
}
