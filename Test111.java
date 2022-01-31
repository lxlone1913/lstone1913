package Demo01Foo;



class Foo{
    void f1(){
        System.out.println('w');

    }
    void f2(){
        System.out.println("star");
    }
}



 public class Test{
   public static void main(String[] args) {
       Foo f = new Foo();
       f.f1();
       f.f2();
       f.f1();


   }
}
