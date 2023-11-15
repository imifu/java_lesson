package calcapp.main;


import calcpp.logics.CalcLogic;

publicclass Calc{
    public static void main (String[]args){
        int a=10; int b=2;
        int tatal = calcapp.logics.CalcLogic.tasu(a,b);
        int delta = calcapp.logics.CalcLogic.hiku(a,b);

        System.out.println("足すと"+total+"引くと"+delta);
    }


}

