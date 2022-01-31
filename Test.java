    package Demo005;


import java.io.FileNotFoundException;

public class Test {

    static void f1(){
        f2();
    }
    static void f2(){
        f3();
    }
    static void f3(){
        System.out.println(8/0);
    }






    public static void main(String[] args) {
        try {
            f1();
        }catch (Exception e){
        e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
}

