public class arr {

    public static void print(int[] arrr){
        for(int i = 0; i < arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
        System.out.println();
    }
    public static void update(int[] marks){
        for(int i = 0; i < marks.length;i++){
            marks[i]++;
        }
        System.out.print("inside the update function : ");
        print(marks);
    }
    public static void main(String args[]){

        int[] arr = {97,98,99};
        System.out.print("inside the main function : ");
        print(arr);
        
        update(arr);
        print(arr);
    }
    
}
