
import java.util.Scanner;

public class exercicioIfEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual era a meta de faturamento anual do ano que passou? ");
        Double metaFaturamentoAnual = scanner.nextDouble();
         System.out.println("qual era o faturamento real do ultimo ano? ");
        Double faturamentoReal = scanner.nextDouble();
         System.out.println("qual era a media salarial do ano anterior? ");
        Double mediaSalarial = scanner.nextDouble();

       Double oitentaPorCento = (metaFaturamentoAnual*80)/100;
       Boolean bateuMeta = faturamentoReal >= metaFaturamentoAnual;
       Boolean FaturouPeloMenosOitentaPorCento = faturamentoReal >= oitentaPorCento;
        if (bateuMeta) {
           System.out.println("Você vai ganhar um bônus de 100%! Ele será de: " + mediaSalarial);
        } else if(FaturouPeloMenosOitentaPorCento){
            System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCento);
        }else{
            System.out.println("Infelizmente, esse ano não tem bônus!");
        }
            scanner.close();
    } 

    }
}
