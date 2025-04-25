package livraria.entidade;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Livro_impresso")
public class Impresso extends Livro{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private double frete;

    @Column
    private int estoque;


    public Impresso(int estoque, double frete) {
        this.estoque = estoque;
        this.frete = frete;
    }

    public Impresso(String autor, String titulo, String editora, double preco, int estoque, double frete) {
        super(autor, titulo, editora, preco);
        this.estoque = estoque;
        this.frete = frete;
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
                '}';
    }
}
