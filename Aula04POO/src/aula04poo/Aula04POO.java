package aula04poo;

public class Aula04POO {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        // c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        // c1.ponta = 0.5f;  
        
        c1.status();
    }
    
}
