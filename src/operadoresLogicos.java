public class operadoresLogicos {
    public static void main(String[] args) {
        Boolean carrinhoMaiorQue100 = true;

        Boolean periodoPromocao = false;

        Boolean jaFezCompraNaLoja = true;
        Boolean pagamentoAVista = false;
        //boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao;

        //boolean aplicarDesconto = carrinhoMaiorQue100 || periodoPromocao;

        // boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao && jaFezCompraNaLoja;

        //boolean aplicarDesconto = carrinhoMaiorQue100 || periodoPromocao || jaFezCompraNaLoja;

        boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoPromocao || jaFezCompraNaLoja) && pagamentoAVista;
        if(aplicarDesconto){
            System.out.println("sim! aplique o desconto.");
        }else{
            System.out.println("nao aplique o desconto.");
        }
    }
}
