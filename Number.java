class A implements Runnable{
    @Override
    public void run() {
        int a=30;
        for (int i=0;i<30;i++)
            System.out.println("natural number");
    }
}
public class Number {
    A obj=new A();
    obj.start();
    }
