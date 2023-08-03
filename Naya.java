class a {
int x;
    public int getX() {
        return x;

    }

    public void setx(int x) {
        System.out.println("i m constructor of in hretance");
        this.x = x;
    }
}
    class b extends a {
        public int y;
        public void gety(int y) {
        System.out.println("new point down");
        this.y = y;
    }
}

public class Naya {
    public static void main(String[] args) {
a ob=new a();
ob.setx(50890000);
System.out.println(ob.getX());
    }
}
