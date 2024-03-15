package aula05poo;

public class ContaBanco {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("[ --------------------------- ]");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    // Métodos Personalizados 
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
            // this.saldo = 50;
        }else if ("CP".equals(t)){
            this.setSaldo(150);
            // this.saldo = 150;
        }
        System.out.println(" [ Conta Aberta com SUCESSO! ] ");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta NAO pode ser fechada! Essa conta ainda tem SALDO!");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta NAO pode ser fechada! Essa conta está em DEBITO!");
        }else{
            this.setStatus(false);
            System.out.println(" [ Conta Fechada com SUCESSO! ] ");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            // this.saldo = this.saldo + v;
            System.out.println("Deposito realizado na conta de " + this.getDono() + " com SUCESSO!");
        }else{
            System.out.println("Impossivel depositar em uma conta que NAO existe!");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() + " com SUCESSO!");
            }else{
                System.out.println("Saldo INSUFICIENTE para saque!");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta FECHADA!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com SUCESSO por " + this.getDono());
        }else{
            System.out.println("Impossivel pagar uma conta FECHADA!");
        }
    }
    
    // Métodos Especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    
}
