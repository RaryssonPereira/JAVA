package aula012;

public class Aula012 {

    public static void main(String[] args) {
        
        // Sub-classes
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        // Filhas das Sub-classes
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        
        System.out.println("");
        
        c.locomover();
        c.usarBolsa();
        k.enterrarOsso();
        k.emitirSom();
        t.locomover();
    }
    
}
