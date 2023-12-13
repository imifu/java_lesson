package calcapp.main; // パッケージ名（calcapp.main）
import java.util.*;
import calcapp.logics.CalcLogic; // 上記入力の手間を省く宣言（import文）
// また全クラスのインポートなら（import calcapp.logics.*;）となる。
//なお、異なるパッケージ間で別れている場合はその他のパッケージもインポートする。

public class Calc {
  public static  void main(String[] args){

    int a = 10;
    int b = 2;

    int total = calcapp.logics.CalcLogic.tasu(a, b); // 先頭にパッケージ名を入れる。

    int delta = CalcLogic.hiku(a,b); //import文を使えば無くても問題ない。

    System.out.println("足すと" + total + "、引くと" + delta);

   //パッケージ名の衝突を防ぐ為、基本的に会社などではインターネットドメインを前後逆順にしてつけている場合が多い。

  }

}
