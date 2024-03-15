/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Rarysson
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)size.getWidth();
        int altura = (int)size.getHeight();
        
        System.out.println("A Hora do Sistema e");
        System.out.println(relogio.toString());
        System.out.print("A Maquina esta no idioma: ");
        System.out.println(idioma);
        System.out.println("Sua resolucao e de : " + " " + largura + " X " + altura);
    }
    
}
