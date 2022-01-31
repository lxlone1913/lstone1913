package demo02_switch;

public class Test3 {
    public static void main(String[] args) {
        String address = "中国银行";
                int len = address.length();
            String biglen ="";
                //1变为一\\
                //2变为二\\
                //3变为三\\
            switch(len){
                case 1:
                    biglen ="一";
                    break;
                case 2:
                    biglen ="二";
                    break;
                case 3:
                    biglen ="三";
                    break;
                case 4:
                    biglen ="四";
                    break;
                case 5:
                    biglen ="五";
                    break;
            case 6:
        biglen ="六";
        break;
                }

        System.out.println("妈妈带我去"+address+"玩，首先映入眼帘的是\""+address+"\""+biglen+"个金光闪闪的鎏金大字");






    }


}
