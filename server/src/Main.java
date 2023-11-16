
import java.util.*;

class Main {
    public static void main(String[] args) { //メインメソッド
    //文字列を取り出してみた
      String value ="あいうえお";
            //  System.out.println(value.charAt(1));

      for(int i= 0; i < value.length(); i++){
        System.out.println("1ばん"+value.charAt(i));
      }

    /*3-1
     weight == 60;
     (age1 +age2) *2 >60;
     age % 2 ==1
     String name =="湊";　正解 name.equals("湊")
    */
    //3-3
    int isHungry = 1;
    String food ="みかん";
    System.out.println("こんにちは");
    if(isHungry == 0){
        System.out.println("お腹がいっぱいです。");}
    else{
        System.out.println(food +"をいただきます。");
    };
    System.out.println("ごちそうさまでした");
        

     //3-5
     System.out.println("1検索 2登録 3削除 4変更");
     
     int selected = 5;
     switch(selected){
        case 1:
             System.out.println("1検索");
             break;
        case 2:
             System.out.println("2登録");
             break;
        case 3:
             System.out.println("3削除");
             break;
        case 4:
             System.out.println("4変更");
             break;               
     }

     //3-6
     System.out.println("数当てゲーム!!5回まで");
     int ans = new java.util.Random().nextInt(9);

     
     for(int i =0 ; i<5 ;i++){
         System.out.println("0から9の数字を入力してください");
         int num =new java.util.Scanner(System.in).nextInt();
         
         if(num == ans){
                     System.out.println("あたり");
                     break; //あたりになったら抜ける
         }else{
                     System.out.println("はずれ");
         }
     }
      System.out.println("おしまい");





    }
}
