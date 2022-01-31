package Demo02Foo;

  class Foo {
    int f1(int a,int b) {
     return a + b;
    }
}
  public class Test{
    public static void main(String[] args) {
        Foo f = new Foo();
        int n = f.f1(88,9);
        System.out.println(n);
    }
}