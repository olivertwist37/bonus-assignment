import java.util.Scanner;
public class palendrome{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what is your supposed palendrome?");
        String obj1 = myObj.nextLine();
        System.out.println(palendrome(tidy(obj1)));
    }
    public static String tidy(String str){
        str = str.replaceAll(",","");
        str = str.replaceAll(" ","");
        str = str.replaceAll(";","");
        str = str.replaceAll(":","");
        str = str.replaceAll("'","");
        str = str.replace(".","");
        return str;
    }
    public static boolean palendrome(String str){
        String reverse = "";
        for (int i =str.length();i>0;i--)reverse += str.substring(i-1,i);
        if (reverse.equals(str))return true;
        else return false;
     }
}
