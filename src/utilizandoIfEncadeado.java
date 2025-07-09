import java.util.Scanner;

public class utilizandoIfEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("digite o peso: ");
        Double peso = scanner.nextDouble();

 //      Boolean pesoLeve = peso <= 60;
 //       Boolean pesoMedio = ( peso >60 ) && ( peso<= 90 );
 //       boolean pesoPesado = peso > 90;

  //      if(pesoLeve){

          //  System.out.println("o lutador é peso leve");
 //       }else{
 //           Boolean pesoMedio = ( peso >60 ) && ( peso<= 90 );
 //            if(pesoMedio){
 //           System.out.println("o lutador é peso medio");
 //       }else{boolean pesoPesado = peso > 90;
 //            if(pesoPesado){
 //         System.out.println("o lutador é peso pesado");}
            
   //     }
  //  }
        
//        if(pesoMedio){
//            System.out.println("o lutador é peso medio");
//        }
//        
 //       if(pesoPesado){
  //          System.out.println("o lutador é peso pesado");
//        }

              Boolean pesoLeve = (peso <= 60) && ( peso > 1 );
              Boolean pesoMedio = ( peso >60 ) && ( peso<= 90 );
              boolean pesoPesado = peso > 90;

               if(pesoLeve){
           System.out.println("o lutador é peso leve");
               }else if (pesoMedio) {
            System.out.println("o lutador é peso medio");
        }else if (pesoPesado) {
             System.out.println("o lutador é peso pesado");
        }else{
            System.out.println("o lutador nao se encaixa em categoria alguma");
        }
        scanner.close();
}
    }

