import java.util.Scanner;

public class exercicioNota {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota");
        Double nota = scanner.nextDouble();

        boolean aprovacao = nota >= 70;


        if (aprovacao){
            System.out.println("aprovado");
        } else{
            System.out.println("reprovado");
        }
        scanner.close();
    }
}