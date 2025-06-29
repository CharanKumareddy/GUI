package GUI.swing;


import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}

class Abc extends JFrame {      //CardLayout

    public Abc() {
        JLabel l = new JLabel("Hello World ");
        JLabel l1 = new JLabel(" Welcome to Charan");
        add(l);
        add(l1);

        setTitle("Frame Title");
        setLayout(new GridBagLayout());  //flowLayout GridLayout Null
        setVisible(true);

        //setSize(400, 400);
        setLocationRelativeTo(null);    //center of the screen
        setResizable(true);
        getContentPane().setBackground(new Color(66, 89, 93));

        JButton btn1 = new JButton("This is a button");
        JButton btn2 = new JButton("This is a button2");
        add(btn1);
        add(btn2);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


