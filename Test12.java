package Demo012;

class A implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("AAA");
            System.out.println("BBB");
            System.out.println("CCC");
            System.out.println("DDD");

              try {
                  Thread.sleep(4000);
              } catch (InterruptedException e){e.printStackTrace();}

        }
    }


}

class B implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("1111");
            System.out.println("2222");
            System.out.println("3333");
            System.out.println("4444");


        }
    }
}
public class Test {


    public static void main(String[] args) {
       A a = new A();
//        B b = new B();
        Thread th = new Thread(a);
//        Thread th2 = new Thread(b);
//        Thread th3 = new Thread();
//        Thread th4 = new Thread(a);
        th.setPriority(1);
//        th2.setPriority(10);
        th.start();
//        th2.start();

    }










}
