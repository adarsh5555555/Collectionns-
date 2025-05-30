import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        System.out.println(VarStr("you " ,"are ","the ","best ","person"));



    }
    public static String VarStr(String...ss){
        String str = "";
        for (String s : ss) {
            str= str+s;

        }
        return str;
    }
}