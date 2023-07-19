
import java.util.*;

class Main {
    public static void main(String[] args) { /*void、返り値無し、mainっていう関数名があって、stringの配列があって、
        それらをargsというパラメーターで受け取っている関数の中が以下！ */

        System.out.println("大根");

        System.out.println("コンパイル実行");

        System.out.println(args[0] + "さん");
        System.out.println("あなたの血液型は" + args[1] + "型で");
        System.out.println("国籍は" + args[2] + "です");

        String[] paras = {"りんご","ゴリラ","ラッパ"};
        alot_of(paras);

       // long x = 65536 ;
     
        //float y = 4.2;

       // (int) x ;

        //System.out.println(x);
        //System.out.print("かぼちゃ");

        /*int a = 369; //小数点がない　数字
        long b = 369369L; //小数点がない　数字で末尾が　L
        double c = 4.2; //小数点付きの数字
        float d = 4.2F; //小数点付きの数字で末尾が　F
        boolean e = true; //true か false
        char f = '私'; //1文字
        string g = "java"; //二重引用符で囲まれた文字

        System.out.println(a);*/

        // int age = mathAge(2023, 1990);


        // System.out.println("私の年齢は" + age + "歳です");

        // String[] uketoru = tamesi(); 

        // System.out.println(uketoru);

        // int[] uketori = nab(); 
        // System.out.println(uketori);   
    }

     /*public static void mathAge(int year,int birth_year){

        int age = year - birth_year;
        System.out.println("わたしは" + age + "歳です");
        
       
         void　は戻り値がないという意味　戻り値がある場合は void ではなくて
         その戻り値の型を記述する この場合は int なので int になる
         
         また配列の場合もその型を記述する
         例： 
             int[] a = {1,2,3,4,5};
             return a;　という場合は int[]　を記述する
        
       受け取る際は、返ってくるのは string[]の配列でuketoru(任意の関数)で
       何から受け取るのかというところでメソッドのtamesi();
        string[] uketoru = tamesi();        
        

    }*/

    /*public static int mathAge(int year,int birth_year){

        int age = year - birth_year;
        return age;
    }
   
    public static String[] tamesi(){

        String[] a = {"1","2","3","4","5"};
        return a;
    }

    public static int[] nab(){
         
        int[] a = {1,2,3,4,5};
        return a;
    }*/

    public static void alot_of(String[] paras) {

        for (int i =0; i < paras.length; i++) {
            System.out.println(paras[i]);
        }
    }






}

    

