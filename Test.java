package Demo003;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = null;

           try {
               char c =s.charAt(0);
           }catch (Exception e){
        System.out.println("c");}

        System.out.println("hello");
        System.out.println(100);
        System.out.println(12345678901230L);
        System.out.println(123444);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("6");
        System.out.println(true);
        System.out.println(true);
        System.out.println("qwr");
        System.out.println(123);

    }


    private static class Char {
    }
}
