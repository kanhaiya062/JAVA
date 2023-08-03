public class reverse {
    public  static void main(String[] args){
         int number=7654321,reverse=0,rem;
         System.out.println("original number: " +number);

        while(number!=0)
        {
             rem=number%10;
            reverse=reverse*10+rem;
            number=number/10;
        }
        System.out.println("the reverse of the given numbrer is: " +reverse);
    }
}
