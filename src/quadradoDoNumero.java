import java.util.Scanner;

public class quadradoDoNumero {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um numero: ");
        Double valor = scanner.nextDouble();

        Double resultado = valor * valor;
        System.out.println("o quadrado do numero é: " + resultado);

     }
}
