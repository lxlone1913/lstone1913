package Demo007;

import java.io.FileWriter;
import java.io.Writer;

public class Test {

    public static void main(String[] args) throws Exception{
        Writer out =new FileWriter("E:\\my.txt");
        //char[] c ="abc".toCharArray();
        char[] c ="飞雪连天射白鹿".toCharArray();
        out.write(c);

        out.close();
        System.out.println("over");










    }






}
