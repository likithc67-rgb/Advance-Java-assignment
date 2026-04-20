package lab6;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {
    JFrame f;

    TabbedPaneExample() {
        f = new JFrame();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);

        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        f.add(tp);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}