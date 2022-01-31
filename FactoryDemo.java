package com.exercise009;

 class FactoryPattern {

    public static Computer creatComputer(String info) {
//fang fa ti
        switch (info) {
            case "huawei":

                Computer c = new Huawei();
                c.setName("huawei");
                c.setPrice(9999);
                return c;

            case "mac":

                Computer c2 = new Mac();
                c2.setName("huawei");
                c2.setPrice(19999);
                return c2;
            default:
                return null;


        }//viod=Computer:method name=creatComputer:canshu=String info

    }


}
abstract class Computer {

    private String name;
    private double price;
//abstract method have not fang fa ti
    public abstract void start();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class Mac extends Computer {

//choose class name+alter/enter+implenmentt method
    @Override
    public void start() {


        System.out.println((getName() + "zhan shi ping guo logo"));
    }
}
class Huawei extends Computer {


    @Override
    public void start() {
        System.out.println((getName() + "kai ji le"));

    }
}
public class FactoryDemo {
    public static void main(String[] args) {
        Computer c = FactoryPattern.creatComputer("huawei");
        c.start();
        Computer c2 = FactoryPattern.creatComputer("mac");
        c2.start();


    }


}
