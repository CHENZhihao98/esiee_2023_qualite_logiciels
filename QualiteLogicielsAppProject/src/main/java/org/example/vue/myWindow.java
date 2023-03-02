package org.example.vue;
import javax.swing.*;
import java.awt.*;

public class myWindow {
    public static void main(String[] args) {
        // get panel
        JPanel windows = new myWindow().panel();

        // Crée le cadre et y auth le panneau
        JFrame cadre = new JFrame("Ma première calculatrice");

        //release windows recourse
        cadre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //init panel content
        cadre.setContentPane(windows);

        // Positionne les dimensions et rend la fenêtre visible
        cadre.setSize(1000,400);
        cadre.setLocationRelativeTo(null);

        cadre.setVisible(true);
    }
    public JPanel panel(){
        // Crée un panneau
        JPanel windows = new JPanel();

//        // Affecte un gestionnaire de disposition à ce panneau
//        FlowLayout disposition = new FlowLayout();
//        windows.setLayout(disposition);
        // Affecte un gestionnaire de presentation à ce panneau
        GridLayout disposition = new GridLayout(4,2);
        windows.setLayout(disposition);

        // Crée les contrôles en mémoire
        JLabel label1 = new JLabel("Nombre 1 :");
        JTextField entree1 = new JTextField(10);
        JLabel label2 = new JLabel("Nombre 2 :");
        JTextField entree2 = new JTextField(10);
        JLabel label3 = new JLabel("Somme :");
        JTextField resultat = new JTextField(10);
        JButton lancer = new JButton("Ajouter");

        // Ajoute les contrôles au panneau
        windows.add(label1);
        windows.add(entree1);
        windows.add(label2);
        windows.add(entree2);
        windows.add(label3);
        windows.add(resultat);
        windows.add(lancer);

        return windows;
    }
}
