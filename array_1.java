
public class array_1 {
    public static void main(String args[]) {
        int[] ar = new int[3];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);

        }
        for(int num :ar){
            System.out.println(num); // here num repersent element of array
        }
    }
}
 
