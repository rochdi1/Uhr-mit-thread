/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Teilnehmer
 */
public class Zeichenflaeche extends Canvas {
    
    ArrayList<Darstellbar> liste;
    
    Koordinate mitte = new Koordinate(350.0, 350.0);
    Koordinate endpunkt;
    

// Konstruktor
    
    public Zeichenflaeche(ArrayList<Darstellbar> liste) {
        this.liste = liste;
    }
    
    public void paint(Graphics g) {
        for(Darstellbar elem:liste)
            elem.zeichnen(g);        
//        Graphics2D g2D = (Graphics2D)g;
//        
//        while(true) {
//            g.setColor(Color.BLUE);
//            GregorianCalendar zeit = new GregorianCalendar();
//            int stunde = zeit.get(GregorianCalendar.HOUR);
//            int minute = zeit.get(GregorianCalendar.MINUTE);
//            int sekunde = zeit.get(GregorianCalendar.SECOND);
//            System.out.println(zeit.get(GregorianCalendar.MINUTE));
//
//            double stdWinkel = stunde * 30 - 90 + minute * 0.5;
//            endpunkt = new Koordinate(mitte, (int)(laenge * 0.7), stdWinkel);
//            g2D.setStroke(strich8);
//            g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)endpunkt.getX(), (int)endpunkt.getY());
//
//            double minWinkel = minute * 6 - 90;
//            endpunkt = new Koordinate(mitte, (int)(laenge * 0.9), minWinkel);
//            g2D.setStroke(strich3);
//            g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)endpunkt.getX(), (int)endpunkt.getY());
//
//            double secWinkel = sekunde * 6 - 90;
//            endpunkt = new Koordinate(mitte, (int)(laenge * 0.9), secWinkel);
//            g2D.setStroke(strich1);
//            g.setColor(Color.red);
//            g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)endpunkt.getX(), (int)endpunkt.getY());        
//            
//            try {    
//                Thread.sleep(1000);
//            } catch(InterruptedException i) {
//                i.printStackTrace();
//            }
//            g.setColor(Color.yellow);
//            g.fillOval((int)(mitte.getX() - 0.91 * laenge), (int)(mitte.getY() - 0.91 * laenge), (int)(2 * 0.91 * laenge), (int)(2 * 0.91 * laenge));
//            
    }    
}
