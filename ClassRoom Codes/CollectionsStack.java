import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
public class CollectionsStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input != 4){
            switch (input) {
                case 1:
                while(!st1.empty())
                    st2.push(st1.pop());
                }
                st1.push(sc.nextInt());
                while(!st2.empty()){
                    st1.push(st2.pop());
                }
                    break;
                case 2:
                    System.out.println(st1.pop());
                    break;
                case 3:
                    System.out.println(st1.peek());
                    break;
                default:
                    break;
            }
            
        }
    }
}
