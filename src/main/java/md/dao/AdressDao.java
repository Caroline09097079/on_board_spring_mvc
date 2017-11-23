package md.dao;

import md.model.Adress;
import md.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AdressDao {


    @PersistenceContext
    private EntityManager entityManager;

    public Adress find(Long id) {
        return entityManager.find(Adress.class, id);
    }


    @Transactional
    public Adress save(Adress adress) {
        if (adress.getId() == null) {
            entityManager.persist(adress);
            return adress;
        } else {
            return entityManager.merge(adress);
        }
    }

}
