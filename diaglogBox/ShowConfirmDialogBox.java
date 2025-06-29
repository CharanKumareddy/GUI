package GUI.diaglogBox;


import javax.swing.*;

public class ShowConfirmDialogBox {
    public static void main(String[] args) {

        //String x = JOptionPane.showInputDialog("Enter your name");
        //JOptionPane.showMessageDialog(null, "Hello World" , "Greeting", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showConfirmDialog(null, "");
        

        Integer integer = JOptionPane.showConfirmDialog(null, "Are you okay?", "Title Here", JOptionPane.YES_NO_OPTION);
        System.out.println(integer);
//        System.out.println(x);
    }
}
