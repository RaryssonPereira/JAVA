package sociedade;

public class Passageiro {
    
    private int numeroSimles;
    private Pessoa pessoa;
    
    public Passageiro(Pessoa p){
        pessoa = p;
    }
    
    public void setNome(String nome){
        pessoa.setNome(nome);
    }
    
    public String getNome(){
        return pessoa.getNome();
    }
    
    public void setEndereco(String endereco){
        pessoa.setEndereco(endereco);
    }
    
    public String getEndereco(){
        return pessoa.getEndereco();
    }

    public int getNumeroSimles() {
        return numeroSimles;
    }

    public void setNumeroSimles(int numeroSimles) {
        this.numeroSimles = numeroSimles;
    }
    
}
