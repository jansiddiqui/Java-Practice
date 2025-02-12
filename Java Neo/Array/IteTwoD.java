import java.util.Scanner;
public class IteTwoD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size = sc.nextInt();
        System.out.println("Insert Array element: ");
        int array[] = new int[size];
        for(int i=0;i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i =0; i<size;i++){
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
