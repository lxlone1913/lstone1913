package apackage.bswing;

import java.util.Stack;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class Calculate {
    public static Stack<String> num = new Stack<String>();
    public static Stack<String> opereat = new Stack<String>();

    public static void work() {

        String s2 = num.pop();
        String s1 = num.pop();
        float num2 = Float.parseFloat(s2);
        float num1 = Float.parseFloat(s1);
        String op = opereat.pop();
        float num3;
        switch (op) {
            case "+":
                num3 = num1 + num2;
                num.push(num3 + "");
                break;
            case "-":
                num3 = num1 - num2;
                num.push(num3 + "");
                break;
            case "*":
                num3 = num1 * num2;
                num.push(num3 + "");
                break;
            case "/":
                num3 = num1 / num2;
                num.push(num3 + "");
                break;


        }


    }
}