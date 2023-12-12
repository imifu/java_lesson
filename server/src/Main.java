import java.util.*;

public class Main {
  public static void main(String[] args) {

   System.out.println("Hello World!");

   System.out.println("Javaの勉強を初めて見ました。");

   System.out.println("これはechoみたいなものです。");

   // コメントの記載テスト（//の場合行末まで。）

   /*この中に記載した内容は全てコメントになります*/

   int age; // 年齢を入れる箱
   age = 20;
   System.out.println(age);

   System.out.println("私は" + age + "歳です。");

   // データ型の種別について
   // 整数の型であれば下記４つ

   byte b; b = 101;  // とても小さい変数
   short s; s = 3600;  // 小さな変数
   int i; i = 21000000;  // 普通の変数(基本的にはintを使用することが多い。)
   long l; l = 900000000;  // 大きな変数

   System.out.println(i + b + s + l);

   // 少数を扱う型は下記２つ

   float weight; weight  = 67.5F;  // 曖昧でもよい少数
   double height; height = 171.2;  // 普通の少数（基本的にはdoubleを使用する場合が多い）

   System.out.println(weight);
   System.out.println(height);
   /*
   上記のような形式を浮動小数点という。
   また、注意事項として、浮動小数点方式には真に厳密な計算ができないという弱点がある。
   その為、誤差が許されない厳密な計算を行う場合は上記データ型は使用しないこと。
   */

   // yesかnoかを収納できる型は下記の１つ

   boolean isError; isError = true;
   boolean result; result = false;

   // 文字を扱う型は下記の２つ

   char zodiac; zodiac = '颯';  // 一文字だけ収納できる
   String name; name = "なかむら";  // 文字列を収納できる

   System.out.println(zodiac);
   System.out.println(name);
   /*
   charのような「文字」データを記述する場合は「''」で囲むのが基本です。
   Stringのような「文字列」データは「”」で囲むのが基本となる。
   */

   // 変数の初期化（上書き）は下記のように再定義をする。
   age = 22;

   // 変数の上書きを防止するにはfinalを記述する。
   final int AGE = 23;  // これを定数宣言という。また定数名は大文字を使うのが基本。

   // 練習問題1-2
   int vertical = 3; int beside = 5;
   int area = vertical * beside;
   System.out.println("縦幅3横幅5の長方形の面積は、" + area);

   // 練習問題1-3
   boolean execution = true; char player = '駆';
   double decimal = 3.14; long large = 314159265853979L;
   String text = "ソウシの攻撃！敵に15ポイントのダメージを与えた。";

   // エスケープシーケンスを使う。
   System.out.println("私が好きな記号は二重引用符（¥”）です");

   // インクリメント演算子
   int operator; operator = 100;
   operator++;
   System.out.println(operator); //++や--は他の演算子と一緒には使わないこと。

   // 値より大きな型の変数に代入
   float f = 3;
   double F = f;

   System.out.println(F);
   System.out.println(f);

   // 強制的な型変換
   int conversion = (int)3.2; // これはキャスト演算子といい強引かつ乱暴なもの
   System.out.println(conversion); // よほどのことがない限り使わない。

   // 異なる型同士の算術演算
   double comrade = 8.5 / 2;
   long arithmetic = 5 + 2L;

   System.out.println(comrade);
   System.out.println(arithmetic);

   // 文字列の連携
   String self = "私の年齢は" + 23;
   System.out.println(self);

   // 命令実行の文
   String names = "なかむら";
   String message;

   message = names + "さん、こんにちは";
   System.out.println(message);

   // [System.out.println]と似ている[System.out.print]
   String nolinedreaks = "そう";
   System.out.print("私のニックネームは");
   System.out.print(nolinedreaks);
   System.out.print("です");  //改行なしの画面出力。

   // 大きい方の数値を代入する命令
   int A = 5;
   int B = 3;
   int C = Math.max(A,B);
   System.out.println("比較実験：" + A + "と" + B + "とで大きい方は" + C);

   // String型をint型に変換する命令
   String change = "22";
   int n = Integer.parseInt(change);
   System.out.println("あなたは今年で" + (n + 1) + "歳になりました。");


   // ランダムな数を生成する命令
   int probability = new java.util.Random().nextInt(90);
   System.out.println("あなたの好きな数字は" + probability + "ですか？");

   // キーボードから入力を受け付ける命令
   System.out.println("君のお名前を教えくれるかな？");
   String username = new java.util.Scanner(System.in).nextLine(); // ここで一度プログラムを停止(入力時間)
   System.out.println(username + "だね、よろしくね！");
   System.out.println("それともう一ついいかな？" + username + "は何歳なの？");
   int detail = new java.util.Scanner(System.in).nextInt(); // ここで一度プログラムを停止
   System.out.println(detail + "歳か、僕と近いね！");

   // 練習問題2-1
   int x = 5;
   int y = 10;
   String ans = "x+yは" + (x + y);
   System.out.println(ans);

   // 練習問題2-3
   System.out.println("ようこそ占いの館へ");
   System.out.println("あなたのお名前を入力してください");
   String usernames = new java.util.Scanner(System.in).nextLine();
   System.out.println("あなたの年齢を入力してください");
   String details = new java.util.Scanner(System.in).nextLine();
   int Age = Integer.parseInt(details);
   int fortune = new java.util.Random().nextInt(4);
   fortune++;
   System.out.println("占いの結果がでました。");
   System.out.println(Age + "歳の" + usernames + "さん、あなたの運勢は" + fortune + "です");
   System.out.println("1: 大吉 2:中吉 3:吉 4: 凶");

   // 天気による行動変化を表す
   boolean tenki = true;
   if (tenki == true){
     System.out.println("選択をします");
     System.out.println("散歩にいきます");
   } else {
     System.out.println("DVDを見る");
   }

   //ト イレが空くまで繰り返すプロセス
   boolean doorClose = false; // ここでtrueかfalseを代入
   while (doorClose == true){
     System.out.println("ドアをノックする");
     System.out.println("1分"); // 今回trueだと無限ループしてしまう。
   }

   // 文字列を比較する際の落とし穴がある
   // 間違いの例
   //if (str == "夕日"){

   // 正しくは下記
   //if (str.equals("夕日")){

   // 文字列が等しいか調べる場合は必ず==「equals」にすること。

   // 論理演算子を用いた複雑条件式

   // && かつ（両方の条件が満たされた時にtrue）
   // || または（どちらか片方の条件さえ満たせばtrue）

   //if (qq >= 18 && month == 5){
   //if (Name.equals("斉藤") || name.equals("斉藤")){


   Scanner scanner = new Scanner(System.in);
   Random random = new Random();

   System.out.println("最初に名前を入力してください：");
   String playerName = scanner.nextLine();
   System.out.println(playerName + "さんというのですね！");

   int playerHealth = 30;
   int demonKnightHealth = 50;
   boolean isFirstBattle = true;

    while (playerHealth > 0 && demonKnightHealth > 0) {
      if (isFirstBattle) {
       System.out.println("それでは...あっ！" + playerName + "さん！目の前に敵が現れましたよ！");
       isFirstBattle = false;
      }
      System.out.println("行動を選んでください。攻撃なら1、防御なら2、魔法なら3を入力：");

      while (!scanner.hasNextInt()) {
       System.out.println("無効な入力です。もう一度入力してください。");
       scanner.next(); // 無効な入力を消費
      }
      int choice = scanner.nextInt();

      if (choice < 1 || choice > 3) {
        System.out.println("1, 2, または 3 を入力してください。");
        continue;
      }

      switch (choice) {
       case 1: // 攻撃
       int attackDamage = random.nextInt(5) + 1;
       System.out.println("悪魔の騎士に攻撃！" + attackDamage + "ダメージを与えました！");
       demonKnightHealth -= attackDamage;
       break;
       case 2: // 防御
       System.out.println(playerName + "は防御しています！");
       break;
       case 3: // 魔法
       if (random.nextBoolean()) {
         int magicDamage = random.nextInt(6) + 5;
         System.out.println(playerName + "は魔法を唱えた！" + magicDamage + "ダメージを与えました！");
         demonKnightHealth -= magicDamage;
        } else {
         System.out.println(playerName + "は魔法に失敗しました！");
        }
       break;
       default:
       System.out.println("再度選択してください。");
       continue;
      }
      // 敵のターン
      if (demonKnightHealth > 0) {
        System.out.println("相手のターンです。");
        if (random.nextInt(100) < 80) {
          // 敵の攻撃
          int enemyAttackDamage = random.nextInt(3) + 1;
          System.out.println("悪魔の騎士に攻撃されました！" + enemyAttackDamage + "ダメージ！");
          if (choice != 2) {
           playerHealth -= enemyAttackDamage;
          } else {
            playerHealth -= Math.max(enemyAttackDamage - 2, 0);
            System.out.println(playerName + "はダメージを減らしました！");
          }
        } else {
          // 敵の魔法
          int enemyMagicDamage = random.nextInt(4) + 3;
          System.out.println("悪魔の騎士は魔法を使いました！" + enemyMagicDamage + "ダメージ！");
          playerHealth -= enemyMagicDamage;
        }
      }
      if (playerHealth <= 0) {
        System.out.println("ゲームオーバー！" + playerName + "は敗れました。");
        break;
      } else if (demonKnightHealth <= 0) {
        System.out.println("ゲームクリア！" + playerName + "は悪魔の騎士を倒しました！");
        break;
      }
    }
    scanner.close();

    // 基本的なfor文
    /*
    for (int is = 0; is < 10; i++){
      System.out.println("おはよう");
    }
    */

    // for文のループ変数iの内容を表示する
    for (int I = 0; I < 3; I++){
      System.out.println("現在" + (I + 1) + "周目→");
    }

    // for文のループを２重にして九九の表を出力する
    for (int multiplicationtable = 1; multiplicationtable < 10; multiplicationtable++){
      for(int overlap = 1; overlap < 10; overlap++){
        System.out.println(multiplicationtable * overlap); // 掛け算の結果を出力
        System.out.println(" "); // 空白を出力
      }
      System.out.println(""); // 改行を出力
    }

   // 練習問題3-1
   //① weight== 60
   //② (age1 + age2)* 2 > 60
   //③ age % 2 == 1
   //④ name.equals("颯")

   // 練習問題3-3
    int isHungry = 1;
    String food = "おにぎり";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else{
      System.out.println("はらぺこです");
    }
    if (isHungry ==1){
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");

   // 練習問題3-6
   System.out.println("数当てゲーム");
   int Ans = new java.util.Random().nextInt(10);
   for (int Z = 0; Z < 5; Z++){
     System.out.println("0~9の数字を入力してください");
     int num = new java.util.Scanner(System.in).nextInt();
     if (Ans == num){
       System.out.println("あたりです！");
       break;
      }else{
       System.out.println("違います");
      }
    }
   System.out.println("数当てゲームを終了します。");

   //明日はここから

  }
}
