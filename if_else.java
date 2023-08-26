import java.util.Scanner;

public class if_else{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            if (a==b){
                System.out.println(" this equal");
            } else {
                if (a<b){
                    System.out.println(" b greater than a");
                }else {
                    System.out.println(" b less tban a");
                }
            }

        }
    }

