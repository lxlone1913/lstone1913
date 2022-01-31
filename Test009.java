package Demo009;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test {
    public static void main(String[] args)throws Exception {
        Reader in=new FileReader("E:\\my.txt");
        BufferedReader  br = new BufferedReader(in);
    String line;
    while ((line =br.readLine())!=null){
            System.out.println(line);
        }
    br.close();



    }
}
