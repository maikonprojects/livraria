package livraria.entidade;

import jakarta.persistence.*;

@Entity
public class Impresso{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private double frete;

    @Column
    private int estoque;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @ManyToOne
    @JoinColumn(name = "fkLivro")
    private Livro livro;

    public Impresso(double frete, int estoque, Livro livro) {
        this.frete = frete;
        this.estoque = estoque;
        this.livro = livro;
    }
    public Impresso() {

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Impresso{" +
                "id=" + id +
                ", frete=" + frete +
                ", estoque=" + estoque +
                ", livro=" + livro +
                '}';
    }
}
