
import java.util.Scanner;

public class exercicioSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero referente a o dia da semana. 1=domingo, 2=segunda, 3=terça, 4=quarta, 5=quinta, 6=sexta e 7=sabado. ");
        Integer numero = scanner.nextInt();

        String dia;

        switch (numero) {
            case 1: dia = "domingo";
                break;
            case 2: dia = "segunda";
                break;
            case 3: dia = "terça";
                break;
            case 4: dia = "quarta";
                break;
            case 5: dia = "quinta";
                break;
            case 6: dia = "sexta";
                break;
            case 7: dia = "sabado";
                break;

            default: dia = "invalido";
        }
        System.out.println("o dia digitado foi  " + dia);
        scanner.close();
    }
}
