package livraria.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "livrariaVirtual")
public class LivrariaVirtual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int maxImpressoras;

    @Column
    private int maxEletronicos;

    @Column
    private int maxVendas;

    @Column
    private int fkImpressos;

    @Column
    private int fkEletronicos;

    @Column
    private int fkVendas;

    @Column
    private int numImpressos;

    @Column
    private int numEletronicos;

    @Column
    private int numVendas;



    public int getNumImpressos() {
        return numImpressos;
    }

    public void setNumImpressos(int numImpressos) {
        this.numImpressos = numImpressos;
    }

    public int getNumEletronicos() {
        return numEletronicos;
    }

    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxImpressoras() {
        return maxImpressoras;
    }

    public void setMaxImpressoras(int maxImpressoras) {
        this.maxImpressoras = maxImpressoras;
    }

    public int getMaxEletronicos() {
        return maxEletronicos;
    }

    public void setMaxEletronicos(int maxEletronicos) {
        this.maxEletronicos = maxEletronicos;
    }

    public int getFkImpressos() {
        return fkImpressos;
    }

    public void setFkImpressos(int fkImpressos) {
        this.fkImpressos = fkImpressos;
    }

    public int getMaxVendas() {
        return maxVendas;
    }

    public void setMaxVendas(int maxVendas) {
        this.maxVendas = maxVendas;
    }

    public int getFkEletronicos() {
        return fkEletronicos;
    }

    public void setFkEletronicos(int fkEletronicos) {
        this.fkEletronicos = fkEletronicos;
    }

    public int getFkVendas() {
        return fkVendas;
    }

    public void setFkVendas(int fkVendas) {
        this.fkVendas = fkVendas;
    }


}
