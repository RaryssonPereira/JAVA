package aula012;

public class Peixe extends Animal{
    
    // Atributos
    private String corEscama;

    // Métodos Públicos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
        
    // Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
