package md.dao;

import md.model.Phone;
import md.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class PhoneDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Phone find(Long id) {
        return entityManager.find(Phone.class, id);
    }


    @Transactional
    public Phone save(Phone phone) {
        if (phone.getId() == null) {
            entityManager.persist(phone);
            return phone;
        } else {
            return entityManager.merge(phone);
        }
    }
}
