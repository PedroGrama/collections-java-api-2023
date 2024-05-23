package main.java.list.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Pessoa2 implements Comparable<Pessoa>{
    public Pessoa2(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    private String nome;
    private int idade;
    private double altura;
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return "Pessoa2 [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
}
/**
 * InnerPessoa2
 */
class comparatorPorAltura implements Comparator<Pessoa2> {

    @Override
    public int compare(Pessoa2 p1, Pessoa2 p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    

    
}
