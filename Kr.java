 class pp2 extends Thread{
public void run(){
    int i=0;
    while (i<4){
        System.out.println("this is my name");
        System.out.println("this is me");
        i++;
    }

}
        }
 class pp3 extends Thread{
     public void run(){
         int i=0;
         while (i<3){
             System.out.println("thread 2");
             System.out.println("new thread 2");
             i++;
         }

     }
 }
 class pp4 extends Thread{
     public void run(){
         int i=0;
         while (i<1){
             System.out.println("i love u so much becouse we fall in love");
             System.out.println("Dill");
             i++;
         }

     }
 }
public class Kr{
    public static void main(String[] args) {
        pp2 t1=new pp2();
        pp3 t2=new pp3();
        pp4 t4=new pp4();
        t1.start();
        t2.start();
        t4.start();

    }
}
