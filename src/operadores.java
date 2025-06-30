public class operadores {
    public static void main(String[] args) {
        Integer adicao = 1+1;
        System.out.println("adicao: " + adicao);

        Integer subtracao = 1-1;
        System.out.println("subtracao: " + subtracao);

        Integer multiplicacao = 2*2;
        System.out.println("multiplicacao: " + multiplicacao);

        Integer divisao = 4/2;
        System.out.println("divisao: " + divisao);

        Integer modulo = 7%4;
        System.out.println("modulo: " + modulo);

        Integer precedencia01 = 1 + 1 * 5;
        System.out.println("precedencia 01: " + precedencia01);

        Integer precedencia02 = (1 + 1) * 5;
        System.out.println("precedencia 02: " + precedencia02);

        Integer precedencia03 = 5 * (1 + 1);
        System.out.println("precedencia 03: " + precedencia03);

        Integer precedencia04 = 5 * (1 + 1) + 2;
        System.out.println("precedencia 04: " + precedencia04);

        Integer precedencia05 = 5 * ((1 + 1) + 2);
        System.out.println("precedencia 05: " + precedencia05);

        Integer cinco = 5;
        Integer um = 1;
        Integer precedenciaComVariaveis = cinco * (um + um);
        System.out.println("precedenciaComVariaveis: " + precedenciaComVariaveis);
    }
}
