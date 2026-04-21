public class hlo {
    public static void main(String args[]){
        int[] arr = new int[]{1,3,2,8,5,4,6};
        int max1 = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1 = arr[i];
            }
        }
        int max2 = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]<max1){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
