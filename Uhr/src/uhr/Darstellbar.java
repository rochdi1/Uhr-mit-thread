/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.Graphics;
import java.util.GregorianCalendar;

/**
 *
 * @author Teilnehmer
 */
public interface Darstellbar {
    
    public void zeichnen(Graphics g);
    
    public void setZeit(GregorianCalendar datum);
    
}
