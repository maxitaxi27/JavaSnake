package gui;

import javax.swing.* ;

public class Gui{

    JFrame jf; /* Berechnung der Pixel, zum Erstellen des Fensters*/

    public static int width = 800, height = 600;  /*nur für Gui-Klasse benötigt*/
    
    public void create(){

        jf = new JFrame ("Snake");
        jf.setSize(width, height); // 800*600 //
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Schließen des Fenster
        jf.setLocationRelativeTo(null);// Fenster wird in der Mitte des Bildschrims geöffnet
        jf.setLayout(null); //kein automatisches Layout, z.B.: automatische Bestimmung der Größe des Fensterlaylouts
        jf.setResizable(false);//feste Größe des Fensters, Größe des Fensters nicht veränderbar


    

    }
}
