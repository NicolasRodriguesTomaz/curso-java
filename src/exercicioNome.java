import java.util.Scanner;

public class exercicioNome {
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("diga seu primeiro nome");
        String nome = scanner.nextLine();

        System.out.println("diga seu segundo nome");
        String sobrenome = scanner.nextLine();

        System.out.println(nome + sobrenome);

        
        scanner.close();
      }

}
