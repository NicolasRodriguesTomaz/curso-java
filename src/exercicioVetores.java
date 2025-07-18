import java.util.Scanner;

public class exercicioVetores {
    public static void main(String[] args) {
        String[] tarefas = new String[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<tarefas.length; i++){
            System.out.println("escreva sua  tarefa numero " + i);
            tarefas[i] = scanner.nextLine();
            
        }
        System.out.println("suas tarefas sao: ");
          for(int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		scanner.close();
    }
    }

