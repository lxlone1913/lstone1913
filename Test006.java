package Demo006;

import java.io.FileWriter;
import java.io.Writer;

public class Test {
    public static void main(String[] args)throws Exception {
        Writer out =new FileWriter("E:\\my.txt");
        //char[] c ="abc".toCharArray();
        char[] c ="guojinghangrong".toCharArray();
        out.write(c);

out.close();
        System.out.println("over");





    }
}









