import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<AddTarefa> listaDeTarefas = new ArrayList<>();

        int r;
        do {
            System.out.println("Gerenciador de Tarefas");
            System.out.println("1 - Adicionar Tarefa:");
            System.out.println("2 - Listar Tarefas:");
            System.out.println("3 - Marcar Como Concluida:");
            System.out.println("4 - Remover Tarefa:");
            System.out.println("5 - Sair");

            int x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1:
                // Adicionar Tarefa
                    AddTarefa novaTarefa = new AddTarefa();
                    listaDeTarefas.add(novaTarefa);

                System.out.println("Tarefa adicionada com sucesso!");
                break;

                case 2:
                    // Listar Tarefas
                    System.out.println("Listando as Tarefas:");
                    if (listaDeTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                    } else {
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println("Tarefa " + (i + 1) + ":");
                            listaDeTarefas.get(i).mostrarTarefas();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    // Marcar tarefa como concluida
                    System.out.println("Digite o número da tarefa que deseja marcar como concluida");
                    int numeroTarefa = sc.nextInt();
                    sc.nextLine();

                   if (numeroTarefa > 0 && numeroTarefa <= listaDeTarefas.size()) {
                       AddTarefa tarefaSelecionada = listaDeTarefas.get(numeroTarefa - 1);
                       tarefaSelecionada.marcarComoConcluida();
                       System.out.println("Tarefa marcada como  concluida com sucesso!");
                       System.out.println("Detalhe da Tarefa:");
                       tarefaSelecionada.mostrarTarefas();
                   } else {
                       System.out.println("Número de tarefas inválido");
                   }
                    break;

                case 4:
                    // Removar Tarefa
                    System.out.println("Digite o número da tarefa que deseja removar:");
                    int numeroRemover = sc.nextInt();
                    sc.nextLine();

                    if (numeroRemover > 0 && numeroRemover <= listaDeTarefas.size()) {
                        listaDeTarefas.remove(numeroRemover - 1);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Número de tarefa inválido");
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }

            System.out.println("Para retomar a operação digite o número [0].");
            System.out.println("Para sair digite [5]");
            r = sc.nextInt();
            sc.nextLine();
        } while ( r == 0);
        System.out.println("Programa encerrado");
    }
}