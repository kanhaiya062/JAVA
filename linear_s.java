public class linear_s {
    public static void main(String[] args) {
        int[] arr={3,5,8,79,233,-2,11};
        int tr=-2;  // tr means is a target
        int ans=linearsearch(arr,tr);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int tr){
        if(arr.length==0){
            return-1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==tr){
                return i;
            }
        }
        return-1;
    }
    
}
