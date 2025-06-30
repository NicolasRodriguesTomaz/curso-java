
import java.util.Scanner;

public class exemploCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("escreva o primeiro valor ");
        Double valor1 = scanner.nextDouble();

        System.out.println("escreva o segundo valor ");
        Double valor2 = scanner.nextDouble();

        System.out.println(" digite a operaçao( 1 = +, 2 = -, 3 = /, 4 = * ): ");
        Integer operacao = scanner.nextInt();

        Double resultado = null;
        if(operacao.equals(1)){
            resultado = valor1 + valor2;
        }
        if(operacao.equals(2)){
            resultado = valor1 - valor2;
        }
        if(operacao.equals(3)){
            resultado = valor1 / valor2;
        }
        if(operacao.equals(4)){
            resultado = valor1 * valor2;
        }
        System.out.println("resultado: " + resultado);
        scanner.close();
    }
    
}
