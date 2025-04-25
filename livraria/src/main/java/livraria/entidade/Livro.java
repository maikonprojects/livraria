package livraria.entidade;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)  // ou JOINED
@DiscriminatorColumn(name = "DTYPE")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String titulo;

    @Column
    private String autores;

    @Column
    private String editora;

    @Column
    private double preco;

    public Livro() {
    }

    public Livro(String autor, String titulo, String editora, double preco) {
        this.autores = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Autor: " + autores + " ,Título do livro: " + titulo + " ,editora: " + editora + " ,preço: " + preco;
    }

    public String getAutor() {
        return autores;
    }

    public void setAutor(String autor) {
        this.autores = autor;
    }

    public String getTituloLivro() {
        return titulo;
    }

    public void setTituloLivro(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}