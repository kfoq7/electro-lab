package lib.utils;

import javax.swing.JOptionPane;

public class ErrorHandler {

    public static void formException(Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
        ex.printStackTrace();
    }

}
