package apackage.bswing;

import java.awt.*;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class BorderLayout {

    public static void main(String[] args) {

        Frame frame = new Frame("my Borberlayout");
        frame.setLayout(new java.awt.BorderLayout(30, 10));
        frame.add(new Button("dong ce an niu"), java.awt.BorderLayout.EAST);
        frame.add(new Button("ben ce an niu"), java.awt.BorderLayout.NORTH);
        frame.add(new Button("nan ce an niu"), java.awt.BorderLayout.SOUTH);
        frame.add(new Button("xi ce an niu"), java.awt.BorderLayout.WEST);
        frame.add(new Button("zhong jian an niu"), java.awt.BorderLayout.CENTER);

        frame.pack();//she zhi zui jia da xiao
        frame.setVisible(true);


    }


}
