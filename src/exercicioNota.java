import java.util.Scanner;

public class exercicioNota {
    static final Integer NOTA_MINIMA_PARA_APROVAÇAO = 70;
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua nota");
        Double nota = scanner.nextDouble();

        boolean aprovacao = nota >= NOTA_MINIMA_PARA_APROVAÇAO;


        if (aprovacao){
            System.out.println("aprovado");
        } else{
            System.out.println("reprovado");
        }
        scanner.close();
    }
}