/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.GregorianCalendar;

/**
 *
 * @author Teilnehmer
 */
public class Zifferblatt implements Darstellbar {
    
    Koordinate mitte;
    Koordinate endpunkt;
    int radius;
    Font schrift;
    Color hFarbe;
    Color zFarbe;
    
    public Zifferblatt(Koordinate mitte, int radius, Font schrift, Color hFarbe, Color zFarbe) {
        this.mitte = mitte;
        this.radius = radius;
        this.schrift = schrift;
        this.hFarbe = hFarbe;
        this.zFarbe = zFarbe;
    }
    

    @Override
    public void zeichnen(Graphics g) {
        g.setFont(schrift);
        double winkel = -60.0;
//        int laenge = 300;
        g.setColor(hFarbe);
        g.fillOval((int)mitte.getX() - radius, (int)mitte.getY() - radius, 2 * radius, 2 * radius);       
        g.setColor(zFarbe);
        for(int i = 0; i < 12; i ++) {
            endpunkt = new Koordinate(mitte, (int)(0.9 * radius), winkel);
//            System.out.println("mitteX: " + mitte.getX() + "mitteY: " + mitte.getY());
//            g.drawLine((int)mitte.getX(), (int)mitte.getY(),
//                       (int)endpunkt.getX(), (int)endpunkt.getY());
            g.drawString(String.valueOf(i + 1), (int)endpunkt.getX(), (int)endpunkt.getY());
            winkel += 30;
        }
    }

    @Override
    public void setZeit(GregorianCalendar datum) {
        
    }
    
}
