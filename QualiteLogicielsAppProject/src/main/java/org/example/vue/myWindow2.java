package org.example.vue;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myWindow2 {
    private JPanel panel1;
    private JTextField textField2;
    private JButton calculerButton;
    private JTextField textField3;
    private JTextField textField1;

    public myWindow2() {
        calculerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"hello");
            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        // Crée le cadre et y auth le panneau
        JFrame cadre = new JFrame("Ma première calculatrice");
        //init panel content
        cadre.setContentPane(new myWindow2().panel1);
        //release windows recourse
        cadre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        cadre.pack();
        cadre.setVisible(true);
    }
}
