package com.exercise010;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */
interface LowCar {//di pen jie kou ji shi xian

    public void run();
}

class BenChiDipenche implements LowCar {
    @Override
    public void run() {
        System.out.println("ben chi di pen che sheng chan cheng gong" +
                "shi su yi bai gong li");
    }
}

class BaoMaDipenche implements LowCar {

    @Override
    public void run() {
        System.out.println("baoma di pen che sheng chan cheng gong " +
                "shi su yi bai gong li");
    }
}
//gao pen jie kou ji shi xiang

interface HighCar {
    public void run();
}

class BenchiGaoDuanChe implements HighCar {

    @Override
    public void run() {
        System.out.println("ben chi gao duan che sheng chan cheng gong " +
                "shi su 200 gong li");
    }
}

class BaoMaGaoDuanChe implements HighCar {
    @Override
    public void run() {
        System.out.println("bao ma gao duan che sheng chan cheng gong " +
                "shi su 200 gong li");
    }
}

//sheng chan xian :chou xiang gong chang ,ben chi gong chang,bao ma gong chang
interface AbstractFactory {

    public LowCar creatLowCar();//di pen fa ---------fang hui di pen

    public HighCar creatHighCar();//gao pen fa-------fang hui gao pen

}

class BenChiFactory implements AbstractFactory {
    @Override
    public LowCar creatLowCar() {
        return new BenChiDipenche();
    }

    @Override
    public HighCar creatHighCar() {
        return new BenchiGaoDuanChe();
    }
}

class BaoMaFactory implements AbstractFactory {
    @Override
    public LowCar creatLowCar() {
        return new BaoMaDipenche();
    }

    @Override
    public HighCar creatHighCar() {
        return new BaoMaGaoDuanChe();
    }
}

//ke hu duan lun
public class AbstractFactoryClient {
    public static void main(String[] args) {
        System.out.println("wo xu yao ge shi ge yang de ben chi che!!!!!!");
        AbstractFactory factory1 = new BenChiFactory();
        HighCar highCar1 = factory1.creatHighCar();
        LowCar lowCar2 = factory1.creatLowCar();
        highCar1.run();
        lowCar2.run();
        System.out.println("wo xu yao ge shi ge yang de baoma che!!!!!!!!!!!!!!!!!!!");


        AbstractFactory factory2 = new BaoMaFactory();
        HighCar highCar3 = factory2.creatHighCar();
        LowCar lowCar1 = factory2.creatLowCar();
        lowCar1.run();
        highCar3.run();
    }
}






