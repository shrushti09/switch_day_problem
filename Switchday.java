package backend;

public class Switchday {
    public static void main(String[] args) {
        int day= 3;
        switch (day) {
            case 1: System.out.println("Monday");
                
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Tuesday");
                break;
            case 6: System.out.println("Tuesday");
                break;
            case 7: System.out.println("Sunday");        
        
            default: System.out.println("Please enter valid day");
                break;
        }

    }
    
}
