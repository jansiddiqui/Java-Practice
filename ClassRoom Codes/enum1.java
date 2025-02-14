enum Day{
    Mon, Tue, Thu, Wed, Fri, Sat
}
public class enum1 {
    public static void main(String[] args){
        for(Day s:Day.values())
        // System.out.println(s+ " "+ (Day.valueOf(s.toString()).ordinal())); 
        // ordinal used for accessing the position of the perticular string in enum
        switch(s){
            case Mon:
                System.out.println("Monday");
                break;
            case Tue:
                System.out.println("Tuesday");
                break;
            case Thu:
                System.out.println("Thursday");
                break;
            case Wed:
                System.out.println("Wednesday");
                break;
            case Fri:
                System.out.println("Friday");
                break;
            case Sat:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}

// if we called the switch case more than number of elements in enum then default will not execute
