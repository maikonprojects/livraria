package livraria.entidade;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("livro_eletronico")
public class Eletronico extends Livro{


    private int tamanho;


    public Eletronico(String autor, String titulo, String editora, double preco, int tamanho) {
        super(autor, titulo, editora, preco);
        this.tamanho = tamanho;
    }

    public Eletronico(int tamanho) {
        this.tamanho = tamanho;
    }

    public Eletronico() {}


    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    @Override
    public String toString() {
        return "Nome do livro: " + getTituloLivro() +
                " Autor: " + getAutor() + "," +
                " Editora: " + getEditora() + "," +
                " Preço: " + getPreco() + "," +
                " Tamanho do livro em KB: " + getTamanho() + " ";
    }

}