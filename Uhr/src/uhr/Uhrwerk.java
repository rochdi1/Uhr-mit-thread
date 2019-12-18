/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Teilnehmer
 */
public class Uhrwerk implements Runnable {//extends Thread {
    
    boolean alive = true;
    ArrayList<Darstellbar> liste;
    Zeichenflaeche zeichenflaeche;
    
    public Uhrwerk(ArrayList<Darstellbar> liste, Zeichenflaeche zeichenflaeche) {
        this.liste = liste;
        this.zeichenflaeche = zeichenflaeche;
    }
    
    public void run() {
        while(alive) {
            GregorianCalendar cal = new GregorianCalendar();
            for(Darstellbar elem:liste)
                elem.setZeit(cal);
            zeichenflaeche.repaint();
        }
    }
}
