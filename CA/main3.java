

public class main3 {
    public static void main(String[] args) {
        int num = -5;

        if(num > 0){
            System.out.println("Positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        switch (Integer.signum(num)){
            case 1:
            System.out.println("Positive");
            break;
            case -1:
            System.out.println("Negative");
            break;
            default: 
            System.out.println("Zero");
        }
    }
}
