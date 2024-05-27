package main.java.set.Pesquisa;
import java.util.*;;
public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;
    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();
        
        agendaContatos.adicionarContato("Pedro H", 632326);
        agendaContatos.adicionarContato("Pedro H", 06565);
        agendaContatos.adicionarContato("Pedro I", 111111);
        agendaContatos.adicionarContato("Pedro J", 222222);
        agendaContatos.adicionarContato("Pedro K", 696969);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println("Contado atualizado " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555));
        agendaContatos.exibirContato();
    }
}
    