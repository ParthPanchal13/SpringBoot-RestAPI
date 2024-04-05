package Hibernate.RestAPI_using_DAO.DAO;

import Hibernate.RestAPI_using_DAO.Entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAll();
    Student findById(int id);

    void save (Student student);

    void deleteStudent(int id);
}
