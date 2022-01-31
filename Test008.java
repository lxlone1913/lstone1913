package Demo008;

import java.io.FileWriter;
import java.io.Writer;

public class Test {
    public static void main(String[] args) throws Exception{
        Writer out = new FileWriter("E:\\my.txt");
        out.write("郭靖");
        out.write("\r\n");
        out.write("黄蓉");
        out.close();
    }
}
