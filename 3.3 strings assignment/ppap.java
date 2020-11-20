import java.util.Scanner;
public class ppap{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what is object 1?");
        String obj1 = myObj.nextLine();
        System.out.println("what is object 2?");
        String obj2 = myObj.nextLine();
        obj1 = obj1.toLowerCase();
        obj2 = obj2.toLowerCase();
        System.out.println("I have a "+obj1+", I have a "+obj2);
        obj2 = obj2.substring(0,1).toUpperCase()+obj2.substring(1,obj2.length());
        System.out.println("Uh! "+obj2+" "+obj1);
    }
}

