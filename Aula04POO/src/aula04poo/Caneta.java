package aula04poo;

public class Caneta {
    
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(){ // Este é um Método Construtor
        this.tampar();
        this.cor = "Azul";
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("----- CANETA ----- ");
        System.out.println(" Modelo: " + this.getModelo());
        System.out.println(" Ponta: " + this.getPonta());
        System.out.println(" Cor: " + this.getCor());
        System.out.println(" Ela esta Tampada? " + this.tampada);       
    }
   
}
