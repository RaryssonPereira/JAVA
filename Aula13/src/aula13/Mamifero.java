package aula13;

public class Mamifero extends Animal {
    // Atributos
    protected String corPelo;

    // Método Especial
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
}
