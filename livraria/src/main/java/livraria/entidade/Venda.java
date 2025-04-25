package livraria.entidade;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "venda_livro",
            joinColumns = @JoinColumn(name = "venda_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private List<Livro> livro;


    @Column
    private int numVendas;

    @Column
    private int numero;

    @Column
    private String cliente;

    @Column
    private double valor;

    public Venda() {
    }


    public Venda(List<Livro> livro, int numVendas, String cliente, int numero, double valor) {
        this.livro = livro;
        this.numVendas = numVendas;
        this.cliente = cliente;
        this.numero = numero;
        this.valor = valor;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Venda(List<Livro> livro) {
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Livro> getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return "Nome do autor: " + getLivro().getFirst().getAutor() + ", " +
                "Nome do livro: " + getLivro().getFirst().getTituloLivro() + ", " +
                "Nome do cliente: " + getCliente() + ", " +
                "Valor da venda: " + getValor() + ", " +
                "Código da Venda: " + getNumero() + " ";
    }




}