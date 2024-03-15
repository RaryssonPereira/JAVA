/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Rarysson
 */
public class Testador {
    
    public static void main(String[] args) {
        
        Correntista c = new Correntista("Edsger Dijkstra", "Universidade Stanford");
        
        ContaCorrente cc = new ContaCorrente(23331, c);
        cc.depositar(450.90);
        
        System.out.println("Nome: " + c.getCorrentista());
        System.out.println("Endereco: " + c.getEndereco());
        System.out.println("Numero da Conta: " + cc.getNumero());
        System.out.println("Banco: " + cc.getCorrentista());
        System.out.println("Saldo na Conta: " + cc.getSaldo());
    }
}
