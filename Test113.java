package Demo003;

import java.util.Arrays;

class  Foo{

    int f1(int x,int y,int z){
        int max = x ;
        if (max < y) max = y;
        if ( max < z) max = z;
        return max;

        }
        private String memberVariabl=initMemberVariable();

    private String initMemberVariable() {
        return "lll";
    }


}






public class Test {
    public static void main(String[] args) {
        Foo f = new Foo();
        int n = f.f1(1,6,7);
        System.out.println(n);



    }



}
