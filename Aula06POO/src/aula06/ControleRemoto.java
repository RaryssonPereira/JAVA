package aula06;

public class ControleRemoto implements Controlador {
    
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais
    public ControleRemoto() {
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        System.out.print("[");
        for (int i = 0; i <= this.getVolume(); i = i + 10){
            System.out.print("|");
        }   
        System.out.println("]");
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel Aumentar volume com o aparelho DESLIGADO!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel Diminuir volume com o aparelho DESLIGADO!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }else{
            System.out.println("Impossivel dar Play com o aparelho DESLIGADO!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        }else{
            System.out.println("Impossivel dar Pause com o aparelho DESLIGADO!");
        }
    }
    
}
