enum Day{
    Mon, Tue, Thu, Wed, Fri, Sat, Sun
}
public class enum1 {
    public static void main(String[] args){
        for(Day s:Day.values())
        System.out.println(s+ " "+ (Day.valueOf(s.toString()).ordinal())); 
        // ordinal used for accessing the position of the perticular string i  enum
    }
    
}
