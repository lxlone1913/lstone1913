package n_proxy.c;

interface ICalc{
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);




}

class CalcImpl implements ICalc {
    @Override
    public int add(int a, int b) {
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a+b;
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("sub fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a-b;
        System.out.println("sub fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("mul fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a*b;
        System.out.println("mul fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("div fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a/b;
        System.out.println("div fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }
}


public class Test {

    public static void main(String[] args) {

        CalcImpl c = new CalcImpl();
        System.out.println(c.add(1,1));
        System.out.println(c.sub(2,3));
        System.out.println(c.mul(4,7));
        System.out.println(c.div(10,4));




    }

}
/*bian hua  : ke hu yao qiu :wen Clac zhong de mei yige fang fa ,qian jia
ri zhi ,ji lu fang fa kai shi he jie shu de shi ji
*
*
* */