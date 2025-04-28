package livraria.entidade;

import jakarta.persistence.*;
import livraria.repositorio.LivrariaRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LivrariaVirtual {

    private int maxImpressos = 10;

    private int maxEletronicos = 20;

    private int maxVendas = 50;

    private int numImpressos;

    private int numEletronicos;

    private int numVendas;

    public void setNumImpressos(int numImpressos) {
        this.numImpressos = numImpressos;
    }

    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public int getNumImpressos() {
        return numImpressos;
    }

    public int getNumEletronicos() {
        return numEletronicos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void cadastrarLivro(){

        Scanner sc = new Scanner(System.in);
        LivrariaRepositorio repositorio = new LivrariaRepositorio();

        System.out.println("\n--- Cadastrar Livro ---");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor(es): ");
        String autor = sc.nextLine();
        System.out.print("Editora: ");
        String editora = sc.nextLine();
        System.out.print("Preço: ");
        double preco = Double.parseDouble(sc.nextLine());
        System.out.print("Tipo do livro (impresso) ou (eletronico): ");
        String tipoLivro = sc.nextLine();


        if(tipoLivro.toLowerCase().equalsIgnoreCase("impresso")){

            System.out.print("Preço do frete: ");
            double frete = Double.parseDouble(sc.nextLine());

            System.out.print("Estoque: ");
            int estoque = Integer.parseInt(sc.nextLine());


            if (numImpressos < maxImpressos) {
                repositorio.addLivro(new Impresso(autor, titulo, editora, preco, frete, estoque));
                numImpressos++;
            }else {
                System.out.print("Número máximo de livros impressos cadastrados!");
            }


        }else {

            System.out.print("Tamanho KB: ");
            int kb = Integer.parseInt(sc.nextLine());

            if (numEletronicos < maxEletronicos) {
                repositorio.addLivro(new Eletronico(autor, titulo, editora, preco, kb));
                numEletronicos++;
            }else {
                System.out.println("Número máximo de livros impressos cadastrados!");
            }

        }

    }

    public void realizarVenda(){

        Scanner sc = new Scanner(System.in);
        LivrariaRepositorio repositorio = new LivrariaRepositorio();


        System.out.println("\n--- Realizar Venda ---");
        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Quantidade de Livros: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        List<Livro> listaPrincipal = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Tipo do livro: ");
            String tipoLivroUsuario = sc.nextLine();

            if (tipoLivroUsuario.equalsIgnoreCase("eletronico")){

                List<Eletronico> listaEletronico = repositorio.listarEletronico();

                for (int j = 0; j < repositorio.listarEletronico().size(); j++) {
                    System.out.println("Id: " + listaEletronico.get(j).getId() + ", Nome do livro: " + listaEletronico.get(j).getTituloLivro() + ", Autor: " + listaEletronico.get(j).getAutor() + ", Editora " + listaEletronico.get(j).getEditora() + ", Preço: " + listaEletronico.get(j).getPreco() + ", Tamanho KB: " + listaEletronico.get(j).getTamanho() );
                }

                System.out.println("Digite o número do livro que deseja comprar: ");
                int numCompraEletronico = Integer.parseInt(sc.nextLine());

                Eletronico eletronico = repositorio.obterPorIdEletronico(numCompraEletronico);
                listaPrincipal.add(eletronico);

            } else if (tipoLivroUsuario.equalsIgnoreCase("impresso")) {
                List<Impresso> listaImpresso= repositorio.listarImpresso();


                for (int j = 0; j < repositorio.listarImpresso().size(); j++) {
                    System.out.println("Id: " + listaImpresso.get(j).getId() + ", Nome do livro: " + listaImpresso.get(j).getTituloLivro() + ", Autor: " + listaImpresso.get(j).getAutor() + ", Editora " + listaImpresso.get(j).getEditora() + ", Preço: " + listaImpresso.get(j).getPreco() + ", Frete: " + listaImpresso.get(j).getFrete() + ", Estoque: " + listaImpresso.get(j).getEstoque() );
                }


                System.out.print("Digite o número do livro que deseja comprar: ");
                int numCompraImpresso = Integer.parseInt(sc.nextLine());

                Impresso impresso = repositorio.obterPorIdImpresso(numCompraImpresso);
                listaPrincipal.add(impresso);

                repositorio.atualizarEstoque(numCompraImpresso);

            }else {
                System.out.println("Valor inválido!");
                i--;
            }


        }

        if(numVendas < maxVendas){
            Long repositorioVenda = repositorio.pegarNumVendas();
            int codigoVenda = repositorio.gerarValorUnico(Math.toIntExact(repositorioVenda));
            Venda vendaLivros = new Venda(listaPrincipal, Math.toIntExact(repositorioVenda), cliente, codigoVenda, listaPrincipal.getFirst().getPreco());
            repositorio.realizarVenda(vendaLivros);
            numVendas++;
        }else {
            System.out.println("Número de vendas máximas alccançadas");
        }

    };

    public void listarlivros(){

        LivrariaRepositorio repositorio = new LivrariaRepositorio();

        List<Eletronico> listaEletronico = repositorio.listarEletronico();
        for (int j = 0; j < repositorio.listarEletronico().size(); j++) {
            System.out.println("Id: " + listaEletronico.get(j).getId() + ", Nome do livro: " + listaEletronico.get(j).getTituloLivro() + ", Autor: " + listaEletronico.get(j).getAutor() + ", Editora " + listaEletronico.get(j).getEditora() + ", Preço: " + listaEletronico.get(j).getPreco() + ", Tamanho KB: " + listaEletronico.get(j).getTamanho() );
        }
        List<Impresso> listaImpresso= repositorio.listarImpresso();
        for (int j = 0; j < repositorio.listarImpresso().size(); j++) {
            System.out.println("Id: " + listaImpresso.get(j).getId() + ", Nome do livro: " + listaImpresso.get(j).getTituloLivro() + ", Autor: " + listaImpresso.get(j).getAutor() + ", Editora " + listaImpresso.get(j).getEditora() + ", Preço: " + listaImpresso.get(j).getPreco() + ", Frete: " + listaImpresso.get(j).getFrete() + ", Estoque: " + listaImpresso.get(j).getEstoque() );
        }
    }

    public void listarVendas(){
        LivrariaRepositorio repositorio = new LivrariaRepositorio();

        List<Venda> vendas = repositorio.listarVendas();

        for (Venda v : vendas) {
            System.out.println("\nVenda #" + v.getNumero() + " | Cliente: " + v.getCliente());
            System.out.println("Livros:");
            for (Livro l : v.getLivro()) {
                System.out.println("→ " + l.getTituloLivro() + " | Autor: " + l.getAutor());
            }
        }
    }

}
