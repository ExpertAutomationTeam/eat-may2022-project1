package switchstatement;

public class Day {

    public void taskToDo(String day){

        switch (day){
            case "Mon":
                System.out.println("first class");
                break;
            case "Tue":
                System.out.println("second class");
                break;
            case "Wed":
                System.out.println("review the recording 1");
                break;
            case "Thu":
                System.out.println("review the recording 2");
                 break;
            case "Fri":
                System.out.println("do homework");
                break;
            case "Sat":
                System.out.println("practice");
                break;
            case "Sun":
                System.out.println("submit homework");
                break;
            default:
                System.out.println("invalid day");
        }

    }
}
