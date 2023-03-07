package org.example.vue;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class myWindow {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Apply look and feel
        UIManager.setLookAndFeel(new NimbusLookAndFeel());


        // get panel
        JPanel contentPane = new myWindow().panel();

        // Crée le cadre et y auth le panneau
        JFrame cadre = new JFrame("Ma première calculatrice");

        //release windows recourse
        cadre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //init panel content
        cadre.setContentPane(contentPane);

        // Positionne les dimensions et rend la fenêtre visible
        cadre.setSize(1000,400);
        cadre.setLocationRelativeTo(null);

        cadre.setVisible(true);
    }
    public JPanel panel(){
        // Crée un panneau
        JPanel contentPane = new JPanel();

//        // Affecte un gestionnaire de disposition à ce panneau
        FlowLayout disposition = new FlowLayout();
        // Affecte un gestionnaire de presentation à ce panneau
//        GridLayout disposition = new GridLayout(4,2);
        contentPane.setLayout(disposition);

        // Crée les contrôles en mémoire
        JLabel label1 = new JLabel("Nombre 1 :");
        JTextField entree1 = new JTextField(10);
        JLabel label2 = new JLabel("Nombre 2 :");
        JTextField entree2 = new JTextField(10);
        JLabel label3 = new JLabel("Somme :");
        JTextField resultat = new JTextField(10);
        JButton lancer = new JButton("Calculer");

        // Ajoute les contrôles au panneau
        contentPane.add(label1);
        contentPane.add(entree1);
        contentPane.add(label2);
        contentPane.add(entree2);
        contentPane.add(label3);
        contentPane.add(resultat);
        contentPane.add(lancer);

        return contentPane;
    }
}
