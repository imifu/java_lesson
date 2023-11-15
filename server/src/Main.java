
import java.util.*;

class Main {
    public static void main(String[] args) { //メインメソッド
        int x = 5;
        int y = 10;
        String ans ="x+yは" + (x + y);
        System.out.println(ans);

        System.out.println("ようこそ占いの館へ");
        System.out.println("名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
       
        System.out.println( age + "さいの" + name + "運気番号は" + fortune +"です。");
        System.out.println( "1:大吉 2:中吉 3:吉 4:キョウ");
    }


}
