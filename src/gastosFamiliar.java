import java.util.Scanner;

public class gastosFamiliar {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Double total = 0.0;

        System.out.println("digite o valor da conta de luz: ");
        total += scanner.nextDouble();

        System.out.println("digite o valor da conta de agua: ");
        total += scanner.nextDouble();
    
        System.out.println("digite o valor da conta de telefone: ");
        total += scanner.nextDouble();
    
        System.out.println("digite o valor do boleto da escola: ");
        total += scanner.nextDouble();

        System.out.println("digite o valor dos gastos no supermercado: ");
        total += scanner.nextDouble();

        System.out.println("este é o total de gastos: " + total);
        
        scanner.close();


    }
}
