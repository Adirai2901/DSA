public class max_sub_arr_sum {
    public static void max(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = i;j<arr.length;j++){
                sum = 0;
                for(int k = i;k<=j;k++){
                    sum += arr[k];
                }
                if(maxsum<sum){
                    maxsum = sum;
                }

            }

        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6  ,8,10};
        max(arr);
    }
}
