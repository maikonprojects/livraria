package livraria.entidade;

import jakarta.persistence.*;
import livraria.repositorio.LivrariaRepositorio;

import java.util.Scanner;

@Entity
@Table(name = "livrariaVirtual")
public class LivrariaVirtual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int maxImpressoras;

    @Column
    private int maxEletronicos;

    @Column
    private int maxVendas;

    @Column
    private int fkImpressos;

    @Column
    private int fkEletronicos;

    @Column
    private int fkVendas;

    @Column
    private int numImpressos;

    @Column
    private int numEletronicos;

    @Column
    private int numVendas;



    public int getNumImpressos() {
        return numImpressos;
    }

    public void setNumImpressos(int numImpressos) {
        this.numImpressos = numImpressos;
    }

    public int getNumEletronicos() {
        return numEletronicos;
    }

    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxImpressoras() {
        return maxImpressoras;
    }

    public void setMaxImpressoras(int maxImpressoras) {
        this.maxImpressoras = maxImpressoras;
    }

    public int getMaxEletronicos() {
        return maxEletronicos;
    }

    public void setMaxEletronicos(int maxEletronicos) {
        this.maxEletronicos = maxEletronicos;
    }

    public int getFkImpressos() {
        return fkImpressos;
    }

    public void setFkImpressos(int fkImpressos) {
        this.fkImpressos = fkImpressos;
    }

    public int getMaxVendas() {
        return maxVendas;
    }

    public void setMaxVendas(int maxVendas) {
        this.maxVendas = maxVendas;
    }

    public int getFkEletronicos() {
        return fkEletronicos;
    }

    public void setFkEletronicos(int fkEletronicos) {
        this.fkEletronicos = fkEletronicos;
    }

    public int getFkVendas() {
        return fkVendas;
    }

    public void setFkVendas(int fkVendas) {
        this.fkVendas = fkVendas;
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

            repositorio.addLivro(new Impresso(autor, titulo, editora, preco, frete, estoque));
        }else {

            System.out.println("Tamanho KB: ");
            int kb = Integer.parseInt(sc.nextLine());

            repositorio.addLivro(new Eletronico(autor, titulo, editora, preco, kb));
        }

    }

}
