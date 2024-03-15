/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Rarysson
 */
public class Testador {
    
    public static void main(String[] args) {
        Estudante e1 = new Estudante(1, "Cecilia");         
        Estudante e2 = new Estudante(2, "Catarina");
   
        
        System.out.println(e1.getNome() + " possui a matricula: " + e1.getMatricula());
        System.out.println(e2.getNome() + " possui a matricula: " + e2.getMatricula());
              
        e1.setNome("Cecilia Franco Pereira");
        System.out.println(e1.getNome() + " possui a matricula: " + e1.getMatricula());
    }
    
}
