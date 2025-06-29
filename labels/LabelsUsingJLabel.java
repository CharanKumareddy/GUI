package GUI.labels;

import javax.swing.*;
import java.awt.*;

public class LabelsUsingJLabel extends JFrame {

    public LabelsUsingJLabel() {
        JLabel l = new JLabel("Hello World...");
        JLabel l2 = new JLabel("Welcome to GUI course");
        this.add(l);
        this.add(l2);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setTitle("Labels");
        this.setSize(500, 800);
        this.getContentPane().setBackground(new Color(86, 93, 97));
        JButton jButton = new JButton("JButton");
        JButton jButton2 = new JButton("JButton2");
        this.add(jButton);
        this.add(jButton2);


        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
