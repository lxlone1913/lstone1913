package Demo002;

class Bird{
    void fly(){
        Wing left = new Wing ();
        Wing right = new Wing();
        System.out.println(left + "" + right + "!!");
    }

}
class Wing{}

public class Test {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.fly();
        b.fly();


    }



}
