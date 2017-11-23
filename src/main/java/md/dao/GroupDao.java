package md.dao;

import md.model.Group;
import md.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class GroupDao {


    @PersistenceContext
    private EntityManager entityManager;

    public Group find(Long id) {
        return entityManager.find(Group.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Group> getPeople() {
        return entityManager.createQuery("select p from Group p").getResultList();
    }

    @Transactional
    public Group save(Group group) {
        if (group.getId() == null) {
            entityManager.persist(group);
            return group;
        } else {
            return entityManager.merge(group);
        }
    }

}
