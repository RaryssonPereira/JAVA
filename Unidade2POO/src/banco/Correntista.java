/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Rarysson
 */
public class Correntista {
    
    private String nome, endereco;
    
    public Correntista (String corr, String end){
        nome = corr;
        endereco = end;
    }
    
    public String getCorrentista(){
        return nome;
    }
    
    public void setEndereco(String end){
        endereco = end;
    }
    
    public String getEndereco(){
        return endereco;
    }
}
