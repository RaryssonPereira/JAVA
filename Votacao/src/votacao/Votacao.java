/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacao;

import java.util.Scanner;

/**
 *
 * @author Rarysson
 */
public class Votacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2023 - nasc;
        System.out.println("Voce tem " + i + " anos.");
        
        if (i < 16){
            System.out.println("Nao pode Votar!");
        } else if ((i >= 16 && i < 18) || (i > 70)){
            System.out.println("O Voto e Opcional!");
        } else{
            System.out.println("O Voto e Obrigatorio!");
        }
    }
    
}
