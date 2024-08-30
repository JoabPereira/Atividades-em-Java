import java.util.Scanner;

public class AddTarefa {

    private String nome;
    private String descricao;
    private boolean concluida;

    public AddTarefa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da Tarefa:");
        this.nome = sc.nextLine();
        System.out.println("Descrição da Tarefa:");
        this.descricao = sc.nextLine();
        this.concluida = false;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }


    public void mostrarTarefas() {
        String status = concluida ? "Concluida" : "Pendente";
        System.out.println("Nome da Tarefa: "  + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Status: " + status);
    }
}
