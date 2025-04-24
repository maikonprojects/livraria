package livraria;

import livraria.entidade.Eletronico;
import livraria.entidade.Impresso;
import livraria.entidade.Livro;
import livraria.repositorio.LivrariaRepositorio;

public class Main {
    public static void main(String[] args) {

        LivrariaRepositorio repLivro = new LivrariaRepositorio();
        //repLivro.atualizarEstoque(2);

        Livro livro = new Livro("Collen Hoover", "É assim que acaba", "Galera Record", 50.00);

        Eletronico livroEletronico = new Eletronico(15);
        Impresso livroImpressao = new Impresso(12, 23, livro);

        repLivro.addLivroImpressao(livro, livroImpressao);
//        repLivro.addLivroEletronico(livro, livroEletronico);
//        System.out.println(repLivro.listarLivro().toString());



    }
}
