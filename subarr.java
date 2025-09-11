public class subarr {
    public static void sub(int[] arr){
        int ts = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println(", Sum = "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+ts);
        
    } 
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10};
        sub(arr);
    }
    
}
