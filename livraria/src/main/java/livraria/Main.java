package livraria;

import livraria.entidade.Eletronico;
import livraria.entidade.Impresso;
import livraria.entidade.Livro;
import livraria.entidade.Venda;
import livraria.repositorio.LivrariaRepositorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        LivrariaRepositorio repositorio = new LivrariaRepositorio();
//
//        while (true) {
//            System.out.println("\n=== MENU LIVRARIA ===");
//            System.out.println("a) Cadastrar livro");
//            System.out.println("b) Realizar uma venda");
//            System.out.println("c) Listar livros");
//            System.out.println("d) Listar vendas");
//            System.out.println("e) Sair do programa");
//            System.out.print("Escolha uma opção: ");
//            String opcao = sc.nextLine();
//
//            switch (opcao.toLowerCase()) {
//                case "a":
//                    System.out.println("\n--- Cadastrar Livro ---");
//                    System.out.print("Título: ");
//                    String titulo = sc.nextLine();
//                    System.out.print("Autor(es): ");
//                    String autor = sc.nextLine();
//                    System.out.print("Editora: ");
//                    String editora = sc.nextLine();
//                    System.out.print("Preço: ");
//                    double preco = Double.parseDouble(sc.nextLine());
//                    System.out.print("Tipo do livro (impresso) ou (eletronico): ");
//                    String tipoLivro = sc.nextLine();
//
//
//                    if(tipoLivro.toLowerCase().equalsIgnoreCase("impresso")){
//
//                        System.out.print("Preço do frete: ");
//                        double frete = Double.parseDouble(sc.nextLine());
//
//                        System.out.print("Estoque: ");
//                        int estoque = Integer.parseInt(sc.nextLine());
//
//                        repositorio.addLivro(new Impresso(autor, titulo, editora, preco, frete, estoque));
//                    }else {
//
//                        System.out.println("Tamanho KB: ");
//                        int kb = Integer.parseInt(sc.nextLine());
//
//                        repositorio.addLivro(new Eletronico(autor, titulo, editora, preco, kb));
//                    }
//
//                    break;
//
//                case "b":
//                    System.out.println("\n--- Realizar Venda ---");
//                    System.out.print("Nome do cliente: ");
//                    String cliente = sc.nextLine();
//
//                    System.out.print("Quantidade de Livros: ");
//                    int quantidade = Integer.parseInt(sc.nextLine());
//
//                    for (int i = 0; i <= quantidade; i++) {
//                        System.out.println("Tipo do livro: ");
//                        String tipoLivroUsuario = sc.nextLine();
//
//                        if (tipoLivroUsuario.toLowerCase().equalsIgnoreCase("eletronico")){
//
//                        }
//
//
//                    }
//
//
//                    System.out.print("ID do livro: ");
//                    int idLivro = Integer.parseInt(sc.nextLine());
//
//                    System.out.print("Número da venda: ");
//                    int numero = Integer.parseInt(sc.nextLine());
//
//
//
//
//                    break;
//
//                case "c":
//                    System.out.println("\n--- Listando Livros ---");
//
//                    break;
//
//                case "d":
//                    System.out.println("\n--- Listando Vendas ---");
//                    repositorio.listarVendas();
//                    break;
//
//                case "e":
//                    System.out.println("Encerrando o programa. Até mais!");
//                    sc.close();
//                    return;
//
//                default:
//                    System.out.println("Opção inválida. Tente novamente.");
//            }
//        }



    LivrariaRepositorio repositorio = new LivrariaRepositorio();
//
 //    List<Livro> livrosVendidos = new ArrayList<>();
//
//    Eletronico eletronico = new Eletronico("t", "t", "w", 24,24);
//    Eletronico eletronico1 = new Eletronico("t", "t", "w", 24,24);
//    Impresso impresso = new Impresso("t", "t", "w", 1,24,24);
//    repositorio.addLivro(eletronico);
//    repositorio.addLivro(eletronico1);
//    repositorio.addLivro(impresso);
//
//    livrosVendidos.add(eletronico);
//    livrosVendidos.add(eletronico1);
//    livrosVendidos.add(impresso);
//
//    Venda venda = new Venda(livrosVendidos, 3,"Monica", 2343, 200);
//    repositorio.realizarVenda(venda);

//    System.out.println(repositorio.listarEletronico());
//    System.out.println(repositorio.listarVendas());
//

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