package Demo017;

import java.util.Arrays;

class Shelf {

    private String[] strs ;
    private int i;

    public Shelf(int n) {
      strs  =  new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i]="○";

        }


    }

    public void put() {
        synchronized (strs) {
            while (isFull()) {
                try {

                    strs.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.strs[i++] = "●";
            System.out.println(Thread.currentThread().getName()+"put," + this);
            strs.notify();
        }

    }

    public void get() {



        synchronized (strs) {
            while (isEmpty()) {
                try {

                    strs.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.strs[--i] = "○";
            System.out.println(Thread.currentThread().getName()+"get," + this);
            strs.notify();
        }

    }

    public boolean isFull() {
        return i == strs.length;

    }

    public boolean isEmpty() {
        return i == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(strs);
    }
}
    class T implements Runnable{
        private Shelf sh;

        public T(Shelf sh) {
            this.sh = sh;
        }

        @Override
        public void run() {

            while (true) {
                sh.put();
            }


        }
    }

    class S implements Runnable{
        private Shelf sh;

        public S(Shelf sh) {
            this.sh = sh;
        }

        @Override
        public void run() {

            while (true) {
                sh.get();
            }


        }
    }







public class App {
    public static void main(String[] args) {
        Shelf sh = new Shelf(10);
       T t = new T(sh);
       S s = new S(sh);
        Thread th = new Thread(t,"guojing");
        Thread th2 = new Thread(t,"yangkang");
        Thread th3 = new Thread(t,"munianci");
        Thread th4 = new Thread(s, "huangrong");
        th.start();
        th2.start();
        th3.start();
         th4.start();

    }




}
