package aula012;

public class Reptil extends Animal{
    
    // Atributos
    private String corEscama;

    // Métodos Públicos
    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
    // Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
