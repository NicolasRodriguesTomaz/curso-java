public class iteracaoFor {
    public static void main(String[] args) {
   //     for(int i = 1;i <= 5;i++){
   //         System.out.println(i + "uma frase qualquer");
   //     }
  // Double[] carrinhoDeCompras = new Double[]{50.0, 51.0, 52.0};
//Doubletotal=0.0;
  //or(int i = 0; i < carrinhoDeCompras.length;i++){
   //ystem.out.println("interacao " + i + ", total: " + total);
   //otal = total + carrinhoDeCompras[i];
  //
  //ystem.out.println("total: " + total);
  //for(int i = 0; i < 10;i++){
    //if(i==5){
      //System.out.println("vai parar");
      //break;
   // }
    //System.out.println("interaçao: " + i);
  //}
//  for(int i = 0; i < 10;i++){
  //  if(i==5){
    //  System.out.println("vai continuar");
     //continue;
    //}
    //System.out.println("interaçao: "+i);
  //}
  Integer[] produtos  = new Integer[]{100,225,300};

  for(int i = 0; i < produtos.length;i++){
    Integer produto=produtos[i];
    System.out.println("produto de codigo: "+produto);
   if(produto.equals(225)){
    System.out.println("produto encontrado");
    break;

   }
  }
    }
}
