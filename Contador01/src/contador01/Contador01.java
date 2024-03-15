/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Rarysson
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        while (cc < 5){
            System.out.println("Cambalhota " + cc);
            cc = cc + 1;
        }
        
        System.out.println("-------------------------------------------");
        
        int CC = 0;
        while (CC < 10){
            CC++;
            if (CC == 3 || CC == 4 || CC == 7){
                continue; // Tem o comando Break que sai do laço
            }
            System.out.println("Carpadinho! " + CC);
        }
    }
    
}
