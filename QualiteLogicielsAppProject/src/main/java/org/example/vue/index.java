package org.example.vue;
import javax.swing.*;
import java.awt.*;

public class index {

    public static class CalculatriceSimple {
        public static void main(String[] args) {
            // Crée un panneau
            JPanel windows = new JPanel();

//            // Affecte un gestionnaire de disposition à ce panneau
//            FlowLayout disposition = new FlowLayout();
//            windows.setLayout(disposition);
            // Affecte un gestionnaire de présentation à ce panneau
            GridLayout disposition = new GridLayout(4,2);
            windows.setLayout(disposition);

            // Crée les contrôles en mémoire
            JLabel label1 = new JLabel("Nombre 1 :");
            JTextField entrée1 = new JTextField(10);
            JLabel label2 = new JLabel("Nombre 2 :");
            JTextField entrée2 = new JTextField(10);
            JLabel label3 = new JLabel("Somme :");
            JTextField résultat = new JTextField(10);
            JButton lancer = new JButton("Ajouter");

            // Ajoute les contrôles au panneau
            windows.add(label1);
            windows.add(entrée1);
            windows.add(label2);
            windows.add(entrée2);
            windows.add(label3);
            windows.add(résultat);
            windows.add(lancer);

            // Crée le cadre et y ajoute le panneau
            JFrame cadre = new JFrame("Ma première calculatrice");
            cadre.setContentPane(windows);

            // Positionne les dimensions et rend la fenêtre visible
            cadre.setSize(400,100);
            cadre.setVisible(true);
        }
    }
}
