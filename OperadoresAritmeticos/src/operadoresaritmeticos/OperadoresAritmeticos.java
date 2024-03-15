/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Rarysson
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        
        int numero = 5;
        int valor = numero + numero++;
        
        int x = 1;
        x += 1; // x = x + 1
        
        float v = 8.5f;
        int ar = (int) Math.round(v);
        
        double aleatorio = Math.random();
        int R = (int) (0 + aleatorio * (6 - 0));
        System.out.println(R);
        
        System.out.println("A media e igual a " + m);
        
        System.out.println(numero);
        System.out.println(valor);
        
        System.out.println(x);
        
        String A = "batata";
        String B = "batatA";
        System.out.println(A.equals(B));
        
        System.out.println(ar);
    }
    
}
