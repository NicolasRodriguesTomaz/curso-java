import java.util.Scanner;

public class exercicioDesconto {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor do produto: ");
        Double valorDoProduto = scanner.nextDouble();

        System.out.print("digite a quantidade de produtos: ");
        Integer quantidade = scanner.nextInt();

        double valorSubtotal = valorDoProduto + quantidade;

        Boolean MaiorOuIgualDez = quantidade >= 10;

        Double percentualDesconto = 0.0;

        if (MaiorOuIgualDez){
            percentualDesconto = 10.0;
        } 
        Double desconto = valorSubtotal * percentualDesconto/100;

        double valorTotalComDesconto = valorSubtotal - desconto;

        System.out.println("valor total: " + valorTotalComDesconto);

        scanner.close(); 
    }
    
}
