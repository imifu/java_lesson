
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("javaの勉強を始めます！");

        //練習２－３    
        System.out.println("「ようこそ占いの館へ」");
        System.out.println("「あなたの名前を入力してください」");

        String name= new java.util.Scanner(System.in).nextLine();
        
        System.out.println("「あなたの年齢を入力してください」");

        String ageString =new java.util.Scanner(System.in).nextLine();
        int age =Integer.parseInt(ageString);
        int fortune =new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("「占いの結果がでました」");
        System.out.println(age +"歳の"+name+"さん、あなたの運気番号は" + fortune +"です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");
        
        //練習３－３
        int isHungry=1;
        String food="おにぎり";
        System.out.println("こんにちは");
        if(isHungry==0){
            System.out.println("お腹いっぱいです");
        }else{
            System.out.println("はらぺこです");
        }if(isHungry==1){
            System.out.println(food+"いただきます");

        }
            System.out.println("ごちそうさまでした");

        //練習３－５
        System.out.println("[メニュー]1:検索2:登録3:取消4:変更>");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch(selected){
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }

        //練習３－６
        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int i=0; i < 5; i++){
            System.out.println("0～9の数字を入力してください");
        
        int num = new java.util.Scanner(System.in).nextInt();
            
            if(num == ans){
                System.out.println("あたり！");
                break;
            }else{
                System.out.println("違います！");
            }
             System.out.println("ゲームを終了します");

        }
        //練習４－

    }
}
