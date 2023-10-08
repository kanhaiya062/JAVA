public class max {
    public static void main(String[] args) {
        int[] arr={2,6,8,945,568,90};
        System.out.println(max(arr));
    }
        static int max(int[] arr){
            int maxvl=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>maxvl){
                    maxvl=arr[i];
                }
            }
            return maxvl;
        
}
}

    
