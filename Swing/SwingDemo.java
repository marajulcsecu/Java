package Swing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame f =new JFrame("User form");
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout());

        JLabel l1= new JLabel("userName :");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        JLabel l2= new JLabel("password :");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);
        JButton b = new JButton("submit");
        f.add(b);
    }
}
