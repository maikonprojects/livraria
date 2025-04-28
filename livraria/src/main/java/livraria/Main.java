package livraria;

import livraria.entidade.*;
import livraria.repositorio.LivrariaRepositorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LivrariaRepositorio repositorio = new LivrariaRepositorio();
        LivrariaVirtual livrariaVirtual = new LivrariaVirtual();

        while (true) {

            //Atualizando variaveis de verificação da livraria virtual
            livrariaVirtual.setNumVendas(Math.toIntExact(repositorio.pegarNumVendas()));
            livrariaVirtual.setNumImpressos(Math.toIntExact(repositorio.pegarNumImpresso()));
            livrariaVirtual.setNumEletronicos(Math.toIntExact(repositorio.pegarNumEletronico()));


            System.out.println("\n=== MENU LIVRARIA ===");
            System.out.println("a) Cadastrar livro");
            System.out.println("b) Realizar uma venda");
            System.out.println("c) Listar livros");
            System.out.println("d) Listar vendas");
            System.out.println("e) Sair do programa");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao.toLowerCase()) {
                case "a":
                    livrariaVirtual.cadastrarLivro();
                    break;

                case "b":
                    livrariaVirtual.realizarVenda();
                    break;

                case "c":
                    System.out.println("\n--- Listando Livros ---");
                    livrariaVirtual.listarlivros();
                    break;

                case "d":
                    System.out.println("\n--- Listando Vendas ---");
                    livrariaVirtual.listarVendas();
                    break;

                case "e":
                    System.out.println("Encerrando o programa. Até mais!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}