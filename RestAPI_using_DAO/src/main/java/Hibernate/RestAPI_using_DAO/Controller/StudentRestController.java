package Hibernate.RestAPI_using_DAO.Controller;

import Hibernate.RestAPI_using_DAO.Entity.Student;
import Hibernate.RestAPI_using_DAO.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();

    }

    @PostMapping("/student")
    public void saveStudent(Student student){
        studentService.save(student);
    }

    @GetMapping("/student/{id}")
    public Student findStudent(@PathVariable int id){
        return studentService.findById(id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
