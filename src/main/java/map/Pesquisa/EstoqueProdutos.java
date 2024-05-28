package main.java.map.Pesquisa;

import java.util.*;

public class EstoqueProdutos {
    // atributos
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double ValorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                ValorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return ValorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto ProdutoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    ProdutoMaisCaro = p;
                }
            }

        }
        return ProdutoMaisCaro;

    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(3L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(4L, "Produto A", 10, 15.0);

        estoque.exibirProdutos();

        System.out.println("O valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais caro: R$" + estoque.obterProdutoMaisCaro());
    }
}
