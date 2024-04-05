package Hibernate.RestAPI_using_DAO.DAO;

import Hibernate.RestAPI_using_DAO.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImp implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> student = entityManager.createQuery("from Student",Student.class);
        return student.getResultList();
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void deleteStudent(int id) {
        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);

    }
}
