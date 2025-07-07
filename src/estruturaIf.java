public class estruturaIf {
    public static void main(String[] args) {
        Double emprestimo=4000.0;
        Double movimentacaoMedia=2000.0;

       // Boolean MovimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
        Boolean AContaTemTempoSuficienteAberto = true;
        Boolean temNomeLimpo = true;

       // Boolean liberaEmprestimo = MovimentaPeloMenosMetadeDoValor 
       // && AContaTemTempoSuficienteAberto && temNomeLimpo;

        if(((movimentacaoMedia * 2) >= emprestimo) 
        && AContaTemTempoSuficienteAberto && temNomeLimpo){
            System.out.println("sim, libere o emprestimo");
        }else{
            System.out.println("nao pode liberar o emprestimo");
        }
    }
}
