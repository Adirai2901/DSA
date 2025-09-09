import java.util.*;

public class max_min {
    public static void input(int[] num, int size){
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i<size;i++){
            num[i] = sc.nextInt();
        }
    }
    public static void INT_MAX(int[] arrr,int x){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < x;i++){
            if(arrr[i]>max){
                max = arrr[i];
            }
        }
        System.out.println("The maximum Number is: "+max);
    }
    public static void INT_MIN(int[] arrr,int x){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < x;i++){
            if(arrr[i]<min){
                min = arrr[i];
            }
        }
        System.out.println("The Minimun Number is: "+min);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Items: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        input(arr,x);
        INT_MAX(arr, x);
        INT_MIN(arr, x);

    }
}
