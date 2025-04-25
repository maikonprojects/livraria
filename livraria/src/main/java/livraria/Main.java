package livraria;

import livraria.entidade.Eletronico;
import livraria.entidade.Impresso;
import livraria.entidade.Livro;
import livraria.repositorio.LivrariaRepositorio;

public class Main {
    public static void main(String[] args) {

        LivrariaRepositorio repLivro = new LivrariaRepositorio();
        //repLivro.atualizarEstoque(2);

        Eletronico livro = new Eletronico("Rafael Montes", "Jantar secreto", "Galera Record", 40.00, 145);
        Impresso livroImpresso = new Impresso("Collen Hoover", "É assim que acaba", "Galera Record", 50.00, 12, 2);

        repLivro.addLivro(livroImpresso);
        repLivro.addLivro(livro);
//        repLivro.addLivroEletronico(livro, livroEletronico);
//        System.out.println(repLivro.listarLivro().toString());



    }
}
