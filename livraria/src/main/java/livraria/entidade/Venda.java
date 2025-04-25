package livraria.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public class Venda extends Livro{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int numVendas;

    @Column
    private int numero;

    public Venda(int numVendas, int numero, String cliente, double valor) {
        this.numVendas = numVendas;
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public Venda(String autor, String titulo, String editora, double preco, int numVendas, int numero, String cliente, double valor) {
        super(autor, titulo, editora, preco);
        this.numVendas = numVendas;
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    @Column
    private String cliente;

    @Column
    private double valor;

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


}
