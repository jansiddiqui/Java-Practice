import java.util.Scanner;

class sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = obj.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.print(arr[i] + " ");
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}