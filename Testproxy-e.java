package n_proxy.e;

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


       Object r = method.invoke(target,args);
        System.out.println(method.getName()+"end,result is"+r);
        return r;
    }
}
class MyProxy{// jian yi ge dai li dui xiang
public  Object getProxy(Object target )

    {
        CalcImpl c = new CalcImpl();// zhen shi dui xiang
        //chang jian class loader !!!!!
        ClassLoader c1 = Test.class.getClassLoader();
        Class[] interfaces = {ICalc.class};

        // InvocationHandler invocationHandler = ;
        //InvocationHandler new Myhandler() = ;
        ICalc proxy = (ICalc) Proxy.newProxyInstance(c1, interfaces, new Myhandler(c));

    return proxy;
    }
}





public class Test {

    public static void main(String[] args) {

        CalcImpl c = new CalcImpl();// zhen shi dui xiang
        ICalc proxy = (ICalc) new MyProxy().getProxy(c);
        // de dao lei de zi jie ma
        proxy.add(1,3);
        proxy.div(3,4);
        System.out.println(new CalcImpl().getClass());

        //de dao lei de zi jie ma de jie kou!!!!!!!!!!

        System.out.println(Arrays.toString(new CalcImpl().getClass().getInterfaces()));


    }
/*bian hua  : ke hu yao qiu :wen Clac zhong de mei yige fang fa ,qian jia
ri zhi ,ji lu fang fa kai shi he jie shu de shi ji
*
*
* */}