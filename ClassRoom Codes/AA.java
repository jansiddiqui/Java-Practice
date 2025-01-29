import java.util.Scanner;
class AA{
    public static void main(String[] args){
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the Day: ");
         int a = obj.nextInt();
         String dayString;
        switch(a){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid Day";

        }
        System.out.println("Day name is: " + dayString);
    }
}
