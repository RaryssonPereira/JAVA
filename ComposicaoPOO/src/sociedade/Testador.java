package sociedade;

public class Testador {
    
    public static void main(String[] args) {
        
        // Criando uma pessoa
        Pessoa pe1 = new Pessoa();
        pe1.setNome("Joao da Silva");
        pe1.setEndereco("Rua ABC, 123");
        
        // Criando um passageiro associado à pessoa
        Passageiro pass1 = new Passageiro(pe1);
        pass1.setNumeroSimles(42);
        
        // Exibindo informações do passageiro
        System.out.println("Nome do Passageiro: " + pass1.getNome());
        System.out.println("Numero do Simples: " + pass1.getNumeroSimles());
        System.out.println("Endereco da Pessoa: " + pass1.getEndereco());
        
        // Atualizando o nome do passageiro
        pass1.setNome("Joao Robertinho da Silva");
        
        // Exibindo as informações atualizadas
        System.out.println("\nNome do passageiro (apos atualizacao): " + pass1.getNome());
    }
}
