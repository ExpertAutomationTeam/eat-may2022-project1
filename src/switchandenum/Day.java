package switchandenum;

public class Day {

    public void taskToDo(Week day){

        switch (day){
            case MON:
                System.out.println("first class");
                break;
            case TUE:
                System.out.println("second class");
                break;
            case WED:
                System.out.println("review the recording 1");
                break;
            case THU:
                System.out.println("review the recording 2");
                 break;
            case FRI:
                System.out.println("do homework");
                break;
            case SAT:
                System.out.println("practice");
                break;
            case SUN:
                System.out.println("submit homework");
                break;
        }

    }
}
