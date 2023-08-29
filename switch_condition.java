import java.util.Scanner;

public class switch_condition {   // this condition need for when we declear 10 of statement like press 1 bengoli and press 3
    // press 2 Hindi and also press difaoult value then press execute value
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch (button){
            case 1:
                System.out.println("english");
                break;
            case 2:
                System.out.println(" hindi");
                break;
            case 3:
                System.out.println(" bengoli");
                break;
            default:System.out.println(" defoult key");
        }
    }
}
