package Hibernate.RestAPI_using_DAO.Service;

import Hibernate.RestAPI_using_DAO.DAO.StudentDAO;
import Hibernate.RestAPI_using_DAO.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    StudentDAO studentDAO;
    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentDAO.findById(id);
    }

    @Override
    public void save(Student student) {
        studentDAO.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
