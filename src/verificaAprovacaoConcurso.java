import java.util.Scanner;

public class verificaAprovacaoConcurso {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        System.out.println("digite a nota de matematica");
        Integer notaMatematica = scanner.nextInt();

        System.out.println("digite a nota de portugues");
        Integer notaPortugues = scanner.nextInt();

        Boolean notaMinimaTotal = notaPortugues + notaMatematica >= 150;

        Boolean notaMinimaPortuges = notaPortugues >= 60;

        Boolean notaMinimaMatematica = notaMatematica >= 60;

        boolean aprovacao = notaMinimaMatematica && notaMinimaPortuges && notaMinimaTotal;

        if (aprovacao){
            System.out.println("esta aprovado");
        }else{
            System.out.println("esta reprovado");
        }

        scanner.close();
    }
}
