package n_proxy.d;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

interface ICalc{
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);




}

class CalcImpl implements ICalc {
    @Override
    public int add(int a, int b) {
        int r=a+b;
        return r;
    }

    @Override
    public int sub(int a, int b) {
        int r=a-b;
        return r;
    }

    @Override
    public int mul(int a, int b) {
        int r=a*b;
        return r;
    }

    @Override
    public int div(int a, int b) {
        int r=a/b;
        return r;
    }
}
class Myhandler implements InvocationHandler{
    private Object target;

    public Myhandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hhhhaaaa");//proxy.add(1,2); yi yi dui ying
        System.out.println(method.getName()+"kai shi ,can shu shi:"+ Arrays.toString(args));


        Object r = method.invoke(target, args);
        System.out.println(method.getName()+"end,result is"+r);
        return r;
    }
}

public class Test {

    public static void main(String[] args) {

        CalcImpl c = new CalcImpl();// zhen shi dui xiang
        c.add(1,2);
        int x= c.add(3,1);
        System.out.println(x);
//chang jian class loader !!!!!
        ClassLoader c1 =Test.class.getClassLoader() ;
        Class[] interfaces ={ICalc.class} ;

       // InvocationHandler invocationHandler = ;
        //InvocationHandler new Myhandler() = ;
    ICalc proxy=(ICalc) Proxy.newProxyInstance(c1,interfaces,new Myhandler(c));
proxy.add(1,2);
        proxy.add(1,2);
        proxy.add(1,2);
        proxy.add(1,2);
    }

}
/*bian hua  : ke hu yao qiu :wen Clac zhong de mei yige fang fa ,qian jia
ri zhi ,ji lu fang fa kai shi he jie shu de shi ji
*
*
* */