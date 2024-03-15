package heranca;

public class Testador {
    
    public static void main(String[] args) {
        
        Funcionario horista = new Horista(1, "Juca", 0, 50, 20);
        horista.calcularSalario();
        
        System.out.println(horista.getSalario());
        
        
        Funcionario comissionado = new Comissionado(1, "Ana", 2000, 480);
        horista.calcularSalario();
        
        System.out.println(comissionado.getSalario());
    }
}
