package n_proxy.f;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

interface ICalc {
    int add(int a, int b);

    int sub(int a, int b);

    int mul(int a, int b);

    int div(int a, int b);


}

class CalcImpl implements ICalc {
    @Override
    public int add(int a, int b) {
        int r = a + b;
        return r;
    }

    @Override
    public int sub(int a, int b) {
        int r = a - b;
        return r;
    }

    @Override
    public int mul(int a, int b) {
        int r = a * b;
        return r;
    }

    @Override
    public int div(int a, int b) {
        int r = a / b;
        return r;
    }
}

class Myhandler implements InvocationHandler {
    private Object target;

    public Myhandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hhhhaaaa");//proxy.add(1,2); yi yi dui ying
        System.out.println(method.getName() + "kai shi ,can shu shi:" + Arrays.toString(args));


        Object r = method.invoke(target, args);
        System.out.println(method.getName() + "end,result is" + r);
        return r;
    }
}

class MyProxy {// jian yi ge dai li dui xiang

    //  feng zhuang 对外隐藏复杂的实现细节，暴露出简单的使用方法
    public static Object getProxy(Object target) {
        //CalcImpl c = new CalcImpl();// zhen shi dui xiang
        //chang jian class loader !!!!!
        //ClassLoader c1 = Test.class.getClassLoader();
        // Class[] interfaces = {ICalc.class};

        // InvocationHandler invocationHandler = ;
        //InvocationHandler new Myhandler() = ;
        //chuang jian dui xiang de dai ma tai fu za

        ClassLoader c1 = MyProxy.class.getClassLoader();//target _____>younger
        Class[] interfaces = target.getClass().getInterfaces();
        Object proxy = Proxy.newProxyInstance(c1, interfaces, new Myhandler(target));


        return proxy;
    }
}

interface Vampire {
    void drinkblood();
}

class YoungVampire implements Vampire {
    @Override
    public void drinkblood() {
        System.out.println("i am vampire,very young!!!!");
    }
}


public class Test {

    public static void main(String[] args) {

/*
        CalcImpl c = new CalcImpl();
        ICalc proxy =(ICalc) MyProxy.getProxy(c);
        ICalc proxy1 = (ICalc) MyProxy.getProxy();
        ICalc proxy2 = (ICalc) MyProxy.getProxy();

        proxy.add(1, 3);

*/
        YoungVampire v = new YoungVampire();

        Vampire proxy = (Vampire) MyProxy.getProxy(v);
        proxy.drinkblood();

    }
/*bian hua  : ke hu yao qiu :wen Clac zhong de mei yige fang fa ,qian jia
ri zhi ,ji lu fang fa kai shi he jie shu de shi ji
*
*2.ru guo xiang jia qi ta de gong neng ,zen me ban??????
* */
}