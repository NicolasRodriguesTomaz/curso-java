import java.util.Scanner; 

public class calcularValorTroco { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("digite a quantidade passada pelo cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        Double resultado = valorPassadoPeloCliente - valorProduto;

        System.out.println("troco: " + resultado);

        scanner.close(); 
    }
    
}