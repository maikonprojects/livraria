package livraria.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int fkLivro;

    @Column
    private int numVendas;

    @Column
    private int numero;

    @Column
    private String cliente;

    @Column
    private double valor;

    public int getFkLivro() {
        return fkLivro;
    }

    public void setFkLivro(int fkLivro) {
        this.fkLivro = fkLivro;
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


}
