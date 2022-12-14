package App;
import Entities.Empresa;
import Entities.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Task> taskList = new ArrayList<>();
        List<Empresa> empresaList = new ArrayList<>();

        String nome = "";
        String desc = "";
        String lvlpriori = "";
        String data = "";
        String cat = "";
        String nomeEmp = "";

        int op = 0;
        do {
            System.out.println("Para criar uma task digite 1");

            System.out.println("Para listar uma task digite 2");
            String response = sc.next();
            System.out.println("Deseja criar uma empresa? (y/n)");
            char responseEmp = sc.next().charAt(0);
            if(responseEmp == 'y') {

                Empresa empresa1 = new Empresa("nome", "cep");
                empresaList.add(empresa1);
            }
            if (response.equals("1")) {

                System.out.println("Nome da task: ");
                sc.nextLine();
                nome = sc.nextLine();

                System.out.println("Descricao da task: ");
                desc = sc.nextLine();

                System.out.println("Data do termino da task: ");
                data = sc.nextLine();

                System.out.println("Prioridade da task: ");
                lvlpriori = sc.nextLine();

                System.out.println("Categoria da task: ");
                cat = sc.nextLine();
            }

            Task task1 = new Task(nome, desc, data, lvlpriori, cat );

            taskList.add(task1);
            if (response.equals("2")) {
                System.out.println(taskList);
            }

            System.out.println("Deseja criar outra task?0 para encerrar e 3 para voltar ao inicio");

            op = sc.nextInt();

        }while(op!= 0);
        }
    }





