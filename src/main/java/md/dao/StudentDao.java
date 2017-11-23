package md.dao;

import md.model.Person;
import md.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Student find(Long id) {
        return entityManager.find(Student.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Student> getPeople() {
        return entityManager.createQuery("select p from Student p").getResultList();
    }

    @Transactional
    public Student save(Student student) {
        if (student.getId() == null) {
            entityManager.persist(student);
            return student;
        } else {
            return entityManager.merge(student);
        }
    }
}
