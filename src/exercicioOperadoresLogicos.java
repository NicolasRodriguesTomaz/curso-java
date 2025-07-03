

import java.util.Scanner;

public class exercicioOperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        Integer idade = scanner.nextInt();

         System.out.println("digite a quantos anos voce contribui com a previdencia: ");
        Integer contribuicaoPrevidencia = scanner.nextInt();

        boolean aposentadoria = idade >= 55 && contribuicaoPrevidencia >= 25;

        if(aposentadoria){
            System.out.println("esta apto a se aposentar");
        }else{
            System.out.println("nao esta apto a se aposentar");
        }


    scanner.close();
    }
    
}
