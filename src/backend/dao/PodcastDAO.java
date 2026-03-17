package backend.dao;

import backend.model.Podcast;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PodcastDAO {
    
    // Nome da unidade de persistência (olhe no seu arquivo persistence.xml para confirmar esse nome)
    private final String PERSISTENCE_UNIT = "CenaflixPodcastGestaoPU"; 
    
    public void salvar(Podcast podcast) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(podcast);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception("Erro ao salvar o podcast no banco: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }
    }
}
