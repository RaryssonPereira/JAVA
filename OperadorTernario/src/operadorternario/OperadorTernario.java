/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author Rarysson
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1;
        System.out.println(r);
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String nome4 = "Banana";
        String res = (nome1 == nome3)?"igual":"diferente";
        System.out.println(nome1.equals(nome3));
        System.out.println(res);
    }
    
}
