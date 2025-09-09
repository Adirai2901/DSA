import java.util.*;
public class linear_search {
    public static void input(int[] num, int size){
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i<size;i++){
            num[i] = sc.nextInt();
        }
    }

    public static void print(int[] abc,int size){
        for(int i = 0;i<size;i++){
            System.out.print(abc[i]+" ");
        }
        System.out.println();
    }
    public static int linear(int[] a,int size,int key){
        for(int i = 0;i<size;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        input(arr, x);
        int y = 0;
        System.out.println("Enter the number you want to search: ");
        y = sc.nextInt();

        if(linear(arr, x, y)>=0){
            System.out.println("The element is present at index: "+linear(arr, x, y));
        }else{
            System.out.println("The element is not present in the given numbers");

        }
        

    }
    
}
