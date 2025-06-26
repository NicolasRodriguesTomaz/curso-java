import java.util.Scanner;

public class alterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("digite o valor do produto ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("digite o tipo de pagamento[1 = a vista, 2 = a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();
        boolean pagamentoAVista = tipoPagamento.equals(1);
        Double juros = 0.0;
        if(pagamentoAVista){

        }else{
            juros = 10.0;
        }
        Double acrescimo = valorProduto * juros/100;
        Double valorTotal = acrescimo + valorProduto;
        System.out.println("valor total: " + valorTotal);
        scanner.close();
    }
}
