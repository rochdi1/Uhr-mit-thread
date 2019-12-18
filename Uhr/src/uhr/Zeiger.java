/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Teilnehmer
 */
public class Zeiger implements Darstellbar {
    
    String art;
    int laenge;
    BasicStroke strich;
    Color farbe;
    int stdWert;
    int minWert;
    int secWert;
    double winkel;
    Koordinate mitte;
    Koordinate ende;
    
    public Zeiger(String art, int laenge, BasicStroke strich, Color farbe, Koordinate mitte) {
        this.art = art;
        this.laenge = laenge;
        this.strich = strich;
        this.farbe = farbe;
        this.mitte = mitte;
    }
    
    public void setZeit(GregorianCalendar cal) {
        stdWert = cal.get(Calendar.HOUR);
        minWert = cal.get(Calendar.MINUTE);
        secWert = cal.get(Calendar.SECOND);
        if(art == "std") 
            winkel = stdWert * 30 - 90 + minWert * 0.5;
        else if (art == "min")
            winkel = minWert * 6 - 90;
        else
            winkel = secWert * 6 - 90;
        ende = new Koordinate(mitte, laenge, winkel);
    }
    
    public void zeichnen(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(strich);
        g.setColor(farbe);
        g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)ende.getX(), (int)ende.getY());
    }
    
}
