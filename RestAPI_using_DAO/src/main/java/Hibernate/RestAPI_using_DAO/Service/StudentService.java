package Hibernate.RestAPI_using_DAO.Service;

import Hibernate.RestAPI_using_DAO.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(int id);

    void save (Student student);

    void deleteStudent(int id);
}
