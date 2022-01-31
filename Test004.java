package Demo004;

import java.io.FileNotFoundException;

public class Test {

    static void f1()throws FileNotFoundException{
        f2();
    }
    static void f2()throws FileNotFoundException{
        f3();
    }
    static void f3()throws FileNotFoundException
    {throw new FileNotFoundException();
    }






    public static void main(String[] args) {
try {
    f1();
}catch (Exception e){
    System.out.println("This is an error");
}
        {throw new RuntimeException();}


    }
}
