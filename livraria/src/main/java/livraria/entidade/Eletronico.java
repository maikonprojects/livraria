package livraria.entidade;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Livro_elotronico")
public class Eletronico extends Livro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int tamanho;

    public Eletronico() {}

    public Eletronico(Livro livro, int tamanho) {
        this.tamanho = tamanho;
    }

    public Eletronico(int tamanho) {
        this.tamanho = tamanho;
    }

    public Eletronico(String autor, String titulo, String editora, double preco, int tamanho) {
        super(autor, titulo, editora, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
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
