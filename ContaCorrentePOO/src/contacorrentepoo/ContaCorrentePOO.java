/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contacorrentepoo;

/**
 *
 * @author Rarysson
 */
public class ContaCorrentePOO {
    
    private String correntista;
    private double saldo;
    private int numero;
    
    public ContaCorrentePOO(int nro, String corr){
        numero = nro;
        correntista = corr;
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
