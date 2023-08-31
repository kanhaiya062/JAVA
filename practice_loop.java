import java.util.Scanner;

public class practice_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      //  int sum=sc.nextInt();
        int sum=0;
        for (a=0;a<10;a++) {
            sum = sum + a;
        }
        System.out.println(" sum value is"+sum);
    }
}
