package livraria;

import livraria.entidade.*;
import livraria.repositorio.LivrariaRepositorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        LivrariaRepositorio repositorio = new LivrariaRepositorio();
//        LivrariaVirtual livrariaVirtual = new LivrariaVirtual();
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
//                    livrariaVirtual.cadastrarLivro();
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
//                    List<Livro> listaPrincipal = new ArrayList<>();
//
//                    for (int i = 0; i < quantidade; i++) {
//                        System.out.println("Tipo do livro: ");
//                        String tipoLivroUsuario = sc.nextLine();
//
//                        if (tipoLivroUsuario.equalsIgnoreCase("eletronico")){
//                            repositorio.listarEletronico();
//
//                        System.out.println("Digite o número do livro que deseja comprar: ");
//                        int numCompraEletronico = Integer.parseInt(sc.nextLine());
//
//                        Eletronico eletronico = repositorio.obterPorIdEletronico(numCompraEletronico);
//                        listaPrincipal.add(eletronico);
//
//
//                        } else if (tipoLivroUsuario.equalsIgnoreCase("impresso")) {
//                            repositorio.listarImpresso();
//
//                            System.out.println("Digite o número do livro que deseja comprar: ");
//                            int numCompraImpresso = Integer.parseInt(sc.nextLine());
//
//                         Impresso impresso = repositorio.obterPorIdImpresso(numCompraImpresso);
//                         listaPrincipal.add(impresso);
//
//                        }else {
//                            System.out.println("Valor inválido!");
//                        }
//
//                        Venda vendaLivros = new Venda(listaPrincipal, );
//
//
//                    }
//
//
//
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
//
//


        System.out.println(repositorio.pegarNumVendas());


//        LISTAR VENDASS
//    List<Venda> vendas = repositorio.listarVendas();
//
//        for (Venda v : vendas) {
//            System.out.println("\nVenda #" + v.getNumero() + " | Cliente: " + v.getCliente());
//            System.out.println("Livros:");
//            for (Livro l : v.getLivro()) {
//                System.out.println("→ " + l.getTituloLivro() + " | Autor: " + l.getAutor());
//            }
//        }
    }
}