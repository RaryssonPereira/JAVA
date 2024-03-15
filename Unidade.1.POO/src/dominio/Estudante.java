/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Rarysson
 */
public class Estudante {
    
    private int matricula;
    private String nome;
    
    public Estudante(int matricula, String nome){
        super();
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
   }
    public int getMatricula(){
        return matricula;
    }
}
