package aula012;

public class Cachorro extends Mamifero{
    
    public void enterrarOsso(){
        System.out.println("Cavando um buraco para colocar seu osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo rapidamente!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au!?");
    }
}
