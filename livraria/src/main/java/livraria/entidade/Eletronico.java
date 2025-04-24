package livraria.entidade;

import jakarta.persistence.*;

@Entity
public class Eletronico{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int tamanho;

    @ManyToOne
    @JoinColumn(name = "fkLivro")
    private Livro livro;

    public Eletronico() {}

    public Eletronico(Livro livro, int tamanho) {
        this.livro = livro;
        this.tamanho = tamanho;
    }

    public Eletronico(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    @Override
    public String toString() {
        return "eletronico{" +
                ", tamanho=" + tamanho +
                '}';
    }

}
