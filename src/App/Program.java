package App;
import Entities.Task;

import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;
import static java.lang.System.exit;
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> ListaTask;

        int op = 0;
        do {
            System.out.println("Para criar uma task digite 1");
            char response = sc.next().charAt(0);
            String lvlpriori = null;
            if (response == '1') {
                System.out.println("__Menu__");
               // System.out.print("Nome da task: ");
              //  String inputnome = sc.nextLine();
               // System.out.print("Descricao da task: ");
              //  System.out.print("Data do termino da task: ");
              //  System.out.print("Prioridade da task: ");
              //  lvlpriori = sc.nextLine();
              //  System.out.print("Categoria da task: ");
            }

            Task task1 = new Task("nome", "desc", "dtermino","lvlpripri", "cat");

            System.out.println(task1);

            System.out.println("Deseja criar outra task?0 para encerrar e qualquer outra tecla para voltar ao inicio");
            op = sc.nextInt();


            }while(op!= 0);
        }
    }





