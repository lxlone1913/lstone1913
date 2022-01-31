package n_proxy.b;

interface ICalc{
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);




}

class CalcImpl implements ICalc{
    @Override
    public int add(int a, int b) {
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a+b;
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a-b;
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a*b;
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        int r=a/b;
        System.out.println("add fang fa de kai shi,can shu shi:"+a+","+b);
        return r;
    }
}
//----------------------------------------------------
class MyCalcImpl extends CalcImpl{
    @Override
    public int add(int a, int b) {
        System.out.println("add fang fa kai shi,can shu shi :"+a+","+b);
        int r = super.add(a, b);
        //super biao shi fu len te zheng ,ke yi diao fu len fang fa
        System.out.println("add fang fa jie shu :over");
        return r;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("sub fang fa kai shi,can shu shi :"+a+","+b);
        int r = super.sub(a, b);
        System.out.println("sub fang fa jie shu :over");
        return r;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("mul fang fa kai shi,can shu shi :"+a+","+b);
        int r = super.mul(a, b);
        System.out.println("mul fang fa jie shu:over");
        return r;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("div fang fa kai shi,can shu shi :"+a+","+b);
        int r = super.div(a, b);
        System.out.println("divfang fa jie shu:over");
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
    c.add(1,1);
    c.sub(2,3);


    }

}
/*bian hua  : ke hu yao qiu :wen Clac zhong de mei yige fang fa ,qian jia
ri zhi ,ji lu fang fa kai shi he jie shu de shi ji
*
*
* */