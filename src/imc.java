import java.util.Scanner; 

public class imc { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a altura: ");
        Double altura = scanner.nextDouble();

        System.out.print("digite o peso: ");
        Double peso = scanner.nextDouble();

        Double multiplicaçaoAltura = altura * altura;

        Double resultadoIMC = peso / multiplicaçaoAltura;

        System.out.println("imc: " + resultadoIMC);

        scanner.close(); 
    }
    
}
