public class tipoLogico {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("variavel verdadeira" + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("variavel false" + variavelFalsa);

        System.out.println("-----------------------------------");

        Integer idade = 15;

        boolean podeTirarCarteira = idade >= 18;

        //System.out.println("pode tirar carteira? " + podeTirarCarteira);

        if (podeTirarCarteira){
            System.out.println("sim ele pode tirar carteira.");
        } else{
            System.out.println("ele nao pode tirar carteira");
        }

        

    }
}
