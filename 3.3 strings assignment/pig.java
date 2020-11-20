import java.util.Scanner;
public class pig{
    public static void main(String[] args){
        String x = new Scanner(System.in).nextLine()+" ";
        String hold="";
        while(x.indexOf(" ")>0){
            if (x.indexOf(" ")>2)hold=x.substring(0,x.indexOf(" "));
            else System.out.print(x.substring(0,x.indexOf(" "))+" ");
            x=x.substring(x.indexOf(" ")+1);
            if (hold.length()>0)System.out.print(hold.substring(1,hold.length())+hold.substring(0,1)+"ly ");
            hold="";
        }
    }
}
