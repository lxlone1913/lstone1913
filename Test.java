package demo02_switch;

public class Test {
    public static void main(String[] args) {
        int i = 8;
        //星期一到星期日期1，2，3，4，5，6，7
        //

        switch (i){
            case 1 :
                System.out.println("Monday");
                break;

        case 2 :
        System.out.println("Tuseday");
        break;
        case 3 :
        System.out.println("Thursday");
break;
        case 4 :
        System.out.println("Wednesday");
        break;
        case 5 :
        System.out.println("Friday");
        break;

        case 6 :
        System.out.println("Saturday");
        break;
        case 7 :
        System.out.println("Sunday");
        break;
            default:
                System.out.println("不认识这个日期");
    }
    }
}
