package livraria.repositorio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import livraria.entidade.Eletronico;
import livraria.entidade.Impresso;
import livraria.entidade.Livro;
import livraria.entidade.Venda;

import java.util.List;

public class LivrariaRepositorio {

    EntityManagerFactory emf;
    EntityManager em;

    public LivrariaRepositorio() {
        emf = Persistence.createEntityManagerFactory("livraria");
        em = emf.createEntityManager();
    }

    public void atualizarEstoque(int codigo){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT i FROM Impresso i WHERE i.id = :idLivro");
            consulta.setParameter("idLivro", codigo);
            List<Impresso> impresso = consulta.getResultList();
            Impresso livro = impresso.get(0);
            int resultado =  livro.getEstoque();
            int estoqueAtual = resultado - 1;
            livro.setEstoque(estoqueAtual);
            em.merge(livro);
            em.getTransaction().commit();
        }finally {
            em.close();
        }

    }

    public void addLivro(Livro livro){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(livro);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public List<Livro> listarLivro(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("select liv from Livro liv");
            List<Livro> liv = consulta.getResultList();
            em.getTransaction().commit();
            return liv;
        }finally {
            em.close();
        }
    }

    public void realizarVenda(Venda venda){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(venda);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public List<Impresso> listarImpresso(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("select liv from Impresso liv");
            List<Impresso> liv = consulta.getResultList();
            em.getTransaction().commit();
            return liv;
        }finally {
            em.close();
        }
    }

    public List<Eletronico> listarEletronico(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("select liv from Eletronico liv");
            List<Eletronico> liv = consulta.getResultList();
            em.getTransaction().commit();
            return liv;
        }finally {
            em.close();
        }
    }

    public List<Venda> listarVendas(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT DISTINCT v FROM Venda v JOIN FETCH v.livro");
            List<Venda> vendas = consulta.getResultList();
            em.getTransaction().commit();
            return vendas;
        }finally {
            em.close();
        }
    }

    public Eletronico obterPorIdEletronico(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Eletronico gerenciado = em.find(Eletronico.class, id);
            em.getTransaction().commit();
            return gerenciado;
        } finally {
            em.close();
        }
    }

    public Impresso obterPorIdImpresso(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Impresso gerenciado = em.find(Impresso.class, id);
            em.getTransaction().commit();
            return gerenciado;
        } finally {
            em.close();
        }
    }

    public Long pegarNumVendas(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery(
                    "SELECT COUNT(v) FROM Venda v"
            );
            consulta.setMaxResults(1);
            Long maiorNumero = (Long) consulta.getSingleResult();
            em.getTransaction().commit();
            return maiorNumero;
        }finally {
            em.close();
        }
    }

    public int gerarValorUnico(int x) {
        if (x < 1) throw new IllegalArgumentException("X deve ser maior que 1");
        long valorUnico = (x * System.nanoTime()) % Integer.MAX_VALUE;
        return (int) valorUnico;
    }


    public Long pegarNumImpresso(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery(
                    "SELECT COUNT(v) FROM Impresso v"
            );
            consulta.setMaxResults(1);
            Long numTotal = (Long) consulta.getSingleResult();
            em.getTransaction().commit();
            return numTotal;
        }finally {
            em.close();
        }
    }

    public Long pegarNumEletronico(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT COUNT(v) FROM Eletronico v");
            Long numTotal = (Long) consulta.getSingleResult();
            em.getTransaction().commit();
            return numTotal;
        }finally {
            em.close();
        }
    }

}