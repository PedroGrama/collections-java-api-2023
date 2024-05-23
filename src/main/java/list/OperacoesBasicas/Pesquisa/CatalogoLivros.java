package main.java.list.OperacoesBasicas.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Menino do Pijama Listrado1", "Marcos Castro", 2020);
        catalogoLivros.adicionarLivro("O Menino do Pijama Listrado1", "Shoupenhaimer", 2021);
        catalogoLivros.adicionarLivro("O Menino do Pijama Listrado3", "Paulo Freire", 2023);
        catalogoLivros.adicionarLivro("O Menino do Pijama Listrado4", "Ruchocrutz", 1995);
        catalogoLivros.adicionarLivro("O Seja Rico ou Morra Tentando5", "Ruchocrutz", 1993);

       // System.out.println(catalogoLivros.pesquisarAutor("Paulo Freire"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Menino do Pijama Listrado1"));
    }
}
