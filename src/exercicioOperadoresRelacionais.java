import java.util.Scanner;

public class exercicioOperadoresRelacionais {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("o valor do produto");
        Double valor = scanner.nextDouble();

        Boolean frete = valor < 100;
        Double valorFinal = valor;

        if (frete) {
            valorFinal += 15.0;
        }
        System.out.println("valor final:" + valorFinal);


        scanner.close();
    }
}
