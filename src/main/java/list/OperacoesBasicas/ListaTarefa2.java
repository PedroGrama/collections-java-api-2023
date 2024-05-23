package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa2 {
    private List<Tarefa2> tarefaList2;

    public ListaTarefa2() {
        this.tarefaList2 = new ArrayList<>();
    }

    public void adicionarTarefa2(String descricao2) {
        tarefaList2.add(new Tarefa2(descricao2));
    }

    public void removerTarefa2(String descricao2) {
        List<Tarefa2> tarefasParaRemover2 = new ArrayList<>();
        for (Tarefa2 t : tarefaList2) {
            if (t.getDescricao2().equalsIgnoreCase(descricao2)) {
                tarefasParaRemover2.add(t);
            }
        }
        tarefaList2.removeAll(tarefasParaRemover2);
    }

    public int obterNumeroTotalTarefas2() {
        return tarefaList2.size();
    }

    public void obterDescricoesTarefas2() {
        System.out.println(tarefaList2);
    }
    public static void main(String[] args) {
        ListaTarefa2 listaTarefa2 = new ListaTarefa2();
        System.out.println("o numero total de elementos na lista e: " + listaTarefa2.obterNumeroTotalTarefas2());

        listaTarefa2.adicionarTarefa2("Tarefa 1");
        listaTarefa2.adicionarTarefa2("Tarefa 1");
        listaTarefa2.adicionarTarefa2("Tarefa 2");
        System.out.println("o numero total de elementos na lista e: " + listaTarefa2.obterNumeroTotalTarefas2());

        listaTarefa2.removerTarefa2("Tarefa 1");
        System.out.println("o numero total de elementos na lista e: " + listaTarefa2.obterNumeroTotalTarefas2());

        listaTarefa2.obterDescricoesTarefas2();
    }
}
