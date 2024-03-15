/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Rarysson
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas patas esse ser tem? ");
        int pernas = teclado.nextInt();
        String tipo;
        
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aracnideo";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Entao ele e um " + tipo);
    }
    
}
