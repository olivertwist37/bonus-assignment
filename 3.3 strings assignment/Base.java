import java.util.Scanner;
import java.lang.Math.*;
public class Base{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what is your number?");
        int x = myObj.nextInt();
        System.out.println("in binary it is ");
        convert(x);
    }
    public static int convert(int x){
       int answer  = 0;
       int z=1;
       int ans = 0;
       for (int i =0;i<x;i++){
          answer = x%2;
          x=x/2;
          if (answer>0)answer=1;
          answer= answer*z;
          ans = ans +answer;
          z=z*10;
          i--;
        }
        System.out.print(ans);
        return ans;
     }
}
