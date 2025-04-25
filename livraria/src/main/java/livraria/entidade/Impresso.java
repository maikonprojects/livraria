package livraria.entidade;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("livro_impresso")
public class Impresso extends Livro{

    @Column
    private double frete;

    @Column
    private int estoque;

    public Impresso(){

    }

    public Impresso(double frete, int estoque) {
        this.frete = frete;
        this.estoque = estoque;
    }

    public Impresso(String autor, String titulo, String editora, double preco, double frete, int estoque) {
        super(autor, titulo, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }



//    public Impresso(String autor, String tituloLivro, String editora, double preco, double frete, int estoque) {
    //        super(autor, tituloLivro, editora, preco);
    //        this.frete = frete;
    //        this.estoque = estoque;
    //    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }


    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + getTituloLivro() +
                " Autor: " + getAutor() + "," +
                " Estoque: " + getEstoque() + "," +
                " Editora: " + getEditora() + "," +
                " Preço: " + getPreco() + "," +
                " Frete: " + getFrete() + "  ";
    }


}