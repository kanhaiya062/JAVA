import java.util.Scanner;
public class mul{
    public static void main(String args[]){
        int a,b,mul;
        System.out.println("enter a value");
        Scanner r=new Scanner(System.in);
        a=r.nextLine();
        b=r.nextLine();
        mul=a*b;
        System.out.println("multification" +mul);
    }
}