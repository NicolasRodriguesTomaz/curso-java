
import java.util.Scanner;

public class vetores1Dimensao {
    public static void main(String[] args) {
        String[] cardapio = new String[4];
        cardapio[0]="queijo";
        cardapio[1]="presunto";
        cardapio[2]="camarao";
        cardapio[3]="calabresa";
        System.out.println("escolha um sabor:");
        cardapio[3] = "frango";
        for(int i = 0; i<cardapio.length; i++){
            System.out.println("[" + i + "]" + cardapio[i]);
        }
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite o numero referente ao sabor desejado: ");
            Integer saborEscolhido = scanner.nextInt();
            System.out.println("voce escolheu o sabor: " + cardapio[saborEscolhido]);
            scanner.close();
        
    }
}
