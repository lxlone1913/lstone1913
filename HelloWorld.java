import javax.swing.*;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class HelloWorld {


    private static void creatAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hello World Swing GUi ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("欢迎学习swing java");
        frame.getContentPane().add(label);
        frame.pack();//she zhi zui jia xiao guo
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creatAndShowGUI();
            }
        });


    }

}






