package livraria;

import livraria.entidade.Eletronico;
import livraria.entidade.Impresso;
import livraria.entidade.Livro;
import livraria.repositorio.LivrariaRepositorio;

public class Main {
    public static void main(String[] args) {

        LivrariaRepositorio repLivro = new LivrariaRepositorio();
        //repLivro.atualizarEstoque(2);

        Eletronico livro = new Eletronico("Collen Hoover", "É assim que acaba", "Galera Record", 50.00, 10);
        Impresso livroImpresso = new Impresso("Collen Hoover", "É assim que acaba", "Galera Record", 50.00, 10, 10);

        repLivro.addLivro(livroImpresso);
        //        repLivro.addLivroEletronico(livro, livroEletronico);
        //        System.out.println(repLivro.listarLivro().toString());



    }
}