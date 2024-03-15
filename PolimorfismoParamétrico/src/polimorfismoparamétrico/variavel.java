package polimorfismoparamétrico;

public class variavel <T> {
    private final T value;

    // Construtor
    public variavel(T value) {
        this.value = value;
    }

    // Método para obter o valor armazenado na caixa
    public T getValue() {
        return value;
    }
}