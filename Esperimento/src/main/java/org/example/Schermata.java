package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public  class Schermata extends Mioframe implements ActionListener, WindowListener {
    public Schermata() {
    }

    public Schermata(String titolo) {
        super(titolo);
        GridLayout gl = new GridLayout(3,2,50,30);
        this.setLayout(gl);

        JLabel casa = new JLabel("Home");
        casa.setFont(new Font("MioFont",Font.ITALIC,14));
        this.add(casa);

        JLabel ospiti = new JLabel("Guest");
        ospiti.setFont(new Font("MioFont",Font.ITALIC,14));
        this.add(ospiti);

        JLabel punti_Casa = new JLabel("0");
        punti_Casa.setFont(new Font("MioFont",Font.BOLD,42));
        this.add(punti_Casa);

        JLabel punti_ospiti = new JLabel("0");
        punti_ospiti.setFont(new Font("MioFont",Font.BOLD,42));
        this.add(punti_ospiti);

        JButton goal_Casa = new JButton("+");
        this.add(goal_Casa);

        JButton goal_Ospiti = new JButton("+");
        this.add(goal_Ospiti);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
