public class bs{

    public static int binar(int[] arr,int target){
        int high = arr.length-1;
        int low = 0;
        while(low<= high){
            int mid = (high +low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }else if(target<arr[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17};
        System.out.println(binar(arr, 17));
    }
}