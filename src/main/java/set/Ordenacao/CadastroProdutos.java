package main.java.set.Ordenacao;
import java.util.*;
public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
    class ComparatorPorQuantidade implements Comparator<Produto>{


        @Override
        public int compare(Produto p1, Produto p2) {
            return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
        }
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    public Set<Produto> exibirProdutosPorQuantidade(){
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtoSet.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 0",15d,5);
        cadastroProdutos.adicionarProduto(2L, "Produto 1",0d,10);
        cadastroProdutos.adicionarProduto(7L, "Produto 3",3d,5);
        cadastroProdutos.adicionarProduto(0L, "Produto 9",9d,2);
        cadastroProdutos.adicionarProduto(9L, "Produto 5",16d,2);

        //System.out.println(cadastroProdutos.produtoSet);
        //System.out.println(cadastroProdutos.exibirProdutosPorNome());
        //System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
