package Demo013;

import java.io.FileWriter;

public class Test {

    public static void main(String[] args)throws Exception {
        char[] c = "abc".toCharArray();
        FileWriter out = new FileWriter("E:\\my.txt");
out.write(c);
out.close();
        System.out.println("over");
        System.out.printf("over");
        System.out.printf("离离原上草一岁一枯荣野火烧不尽春风吹又生远芳侵古道晴翠接荒城又送王孙去萋萋满别情");

    }
}
