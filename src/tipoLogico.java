public class tipoLogico {
    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("variavel verdadeira" + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("variavel false" + variavelFalsa);

        System.out.println("-----------------------------------");
        //final Integer idadeMinimaTirarCarteira = 18;

        Integer idade = 15;

        boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

        //System.out.println("pode tirar carteira? " + podeTirarCarteira);

        if (podeTirarCarteira){
            System.out.println("sim ele pode tirar carteira.");
        } else{
            System.out.println("ele nao pode tirar carteira");
        }

        

    }
}
