package Demo015;
class A implements Runnable{


    @Override
    public void run() {
        while (!Thread.interrupted()){
            System.out.println("aah");
            System.out.println("bobby");
            System.out.println("cocci");
            System.out.println("dddd");
        }
        System.out.println("~~~~" + Thread.interrupted());




    }
}








public class Test {
    public static void main(String[] args) throws Exception{
        A a = new A();
        Thread th = new Thread(a);
th.start();
System.in.read();
th.interrupt();



























































    }






}
