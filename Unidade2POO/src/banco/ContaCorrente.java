/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Rarysson
 */
public class ContaCorrente {
    
    private Correntista correntista;
    private double saldo;
    private int numero;
    
    public ContaCorrente(int nro, Correntista corr){
        numero = nro;
        correntista = corr;
    }
    
    public Correntista getCorrentista(){
        return correntista;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        if (existeSaldo(valor) == true)
            saldo = saldo - valor;
    }
    
    private boolean existeSaldo(double valor){
        if (valor <= saldo)
            return true;
        else
            return false;
    }
}
