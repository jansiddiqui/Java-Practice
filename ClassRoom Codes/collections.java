import java.util.LinkedList;
import java.util.Scanner;
public class collections {
    public static void main(String[] args) {
        LinkedList<Integer> ld = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of node you want to insert in the list: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the node: ");
            ld.add(sc.nextInt());
        }
        int evenIdxsum = 0;
        int oddIdxsum = 0;
        for(int i=0;i<ld.size();i++){
            if(i%2 == 0){
                evenIdxsum = ld.get(i) + evenIdxsum;
            }else{
                oddIdxsum = ld.get(i) + oddIdxsum;
            }
        }
        System.out.println("ODD sum: " + oddIdxsum);
        System.out.println("EVEN sum: " + evenIdxsum);
        Object ldds;
        ldds = ld.clone();
        System.out.println("The cloned list is: " + ldds);
        System.out.println("The original list is: " + ld);
        ld.size();
        System.out.println("The size of the list is: " + ld.size());

        //adding two consicutive elements of the list
        for(int i=0;i<ld.size();i++){
            if((i+1)<ld.size()){
                System.out.println(ld.get(i) + ld.get(i+1));
            }else{
                System.out.println(ld.get(i));
            }
        }
    }
}
