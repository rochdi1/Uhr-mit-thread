/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author Teilnehmer
 */
public class Uhr extends Frame {
    
    ArrayList<Darstellbar> liste = new ArrayList<Darstellbar>();
    BasicStroke strich8 = new BasicStroke(8);
    BasicStroke strich3 = new BasicStroke(3);
    BasicStroke strich1 = new BasicStroke(1); 
    Uhrwerk uhrwerk;

    public Uhr() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(730, 750);
        this.setTitle("Analog-Uhr");
        Koordinate mitte = new Koordinate(300., 300.);
        Font schrift = new Font("Arial", Font.PLAIN, 24);
        Color hFarbe = Color.yellow;
        Color zFarbe = Color.BLUE;
        Zifferblatt zifferblatt = new Zifferblatt(mitte, 300, schrift, hFarbe, zFarbe);
        liste.add(zifferblatt);
        Zeiger std = new Zeiger("std", 210, strich8, Color.BLACK, mitte);
        Zeiger min = new Zeiger("min", 240, strich3, Color.BLACK, mitte);
        Zeiger sec = new Zeiger("sec", 250, strich1, Color.RED, mitte);
        liste.add(std); liste.add(min); liste.add(sec);
        Zeichenflaeche zeichenflaeche = new Zeichenflaeche(liste);
        uhrwerk = new Uhrwerk(liste, zeichenflaeche);
        
        this.add(zeichenflaeche);
        this.setVisible(true);
        uhrwerk.run();
    }
    
    public static void main(String[] args) {
        new Uhr();
    }
    
}
