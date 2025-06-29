package GUI.diaglogBox;

import javax.swing.*;

public class showOptionDialog {

    public static void main(String[] args) {

        ImageIcon my_icon = new ImageIcon("./images/Screenshot.png");
        String[] btn_option = {"Yes I am", "No, I am not", "I do not know"};

        int x = JOptionPane.showOptionDialog(null, "Are you okay?", "Demo Show Dialog Option",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, my_icon, btn_option, null);

        System.out.println(x);
    }
}
