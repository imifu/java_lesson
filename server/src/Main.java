
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("大根");

        System.out.println("コンパイル実行");

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
        mathAge(2023, 1990);

         int[] reidai2 = reidai();
        
    }

    public static void mathAge(int year,int birth_year){

        int age = year - birth_year;
        System.out.println("わたしは" + age + "歳です");
        
        /*
         void　は戻り値がないという意味　戻り値がある場合は void ではなくて
         その戻り値の型を記述する この場合は int なので int になる
         
         また配列の場合もその型を記述する
         例： 
             int[] a = {1,2,3,4,5};
             return a;　という場合は int[]　を記述する
        */

       

    }

    public static int[] reidai() {

        int[] a = {1,2,3,4,5};
        return a;

    }

    
}
