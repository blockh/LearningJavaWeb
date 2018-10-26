package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Blockhead
 * 2018/10/22 18:58
 */
public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("确定");
        frame.add(button);
        button.addActionListener(e -> System.out.println("hello!"));
        frame.setVisible(true);
    }
}
