package Demo014;
class A implements Runnable{
    public void run() {
        while (true){
            System.out.println("aaaa");
            System.out.println("bbbb");
            System.out.println("cccc");
            System.out.println("dddd");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){e.printStackTrace();}




        }



    }
}






public class Test {
    public static void main(String[] args) {

        A a = new A();
        Thread th = new Thread(a);
th.start();
    }




}
