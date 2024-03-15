package polimorfismoparamétrico;

public class PolimorfismoParamétrico {

    public static void main(String[] args) {
        
        // Criando uma caixa de Integer
        variavel<Integer> integerBox = new variavel<>(10);
        System.out.println("Valor na caixa de Integer: " + integerBox.getValue());

        // Criando uma caixa de String
        variavel<String> stringBox = new variavel<>("Hello, Generics!");
        System.out.println("Valor na caixa de String: " + stringBox.getValue());

        // Criando uma caixa de Double
        variavel<Double> doubleBox = new variavel<>(3.14);
        System.out.println("Valor na caixa de Double: " + doubleBox.getValue());
    }
    
}
