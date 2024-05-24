package main.java.list.OperacoesBasicas;
import java.util.*;
public class ConjuntoConvidados {
    //atributos
    private Set<Convidado>convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if(c.getCodigoConvite()==codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        
        conjuntoConvidados.adicionarConvidado("Luizinho", 1234);
        conjuntoConvidados.adicionarConvidado("Luizinho2", 2234);
        conjuntoConvidados.adicionarConvidado("Luizinho3", 2234);
        conjuntoConvidados.adicionarConvidado("Luizinho4", 4234);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
        
    }

}
