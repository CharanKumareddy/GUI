package GUI;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        String x;
        String y;

//        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a your first number"));
//        y = Integer.parseInt(JOptionPane.showInputDialog("Enter your Second number"));

        x = JOptionPane.showInputDialog("Enter a your first number");
        y = JOptionPane.showInputDialog("Enter your Second number");

        int fn = Integer.parseInt(x);
        int sn = Integer.parseInt(y);

        int sum = fn + sn;
        System.out.println("Sum of x + y value is: " + (fn + sn));
        JOptionPane.showMessageDialog(null, "Sum of x + y value is: " + sum, "Output of sum", JOptionPane.PLAIN_MESSAGE);

    }
}
