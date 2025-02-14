enum Month{
    Jan(31), Feb(28),Mar(31);
    int totalday;
    Month(int day) {
        totalday = day;
    }
}
//By default enum is (public static final)
public class enum2 {
    public static void main(String[] args){
        for(Month s:Month.values())
        //     System.out.println(s + " " + s.totalday);
        switch(s){
            case Jan:
                System.out.println(s + " " + s.totalday);
                break;
            case Feb:
                System.out.println(s + " " + s.totalday);
                break;
            case Mar:
                System.out.println(s + " " + s.totalday);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
