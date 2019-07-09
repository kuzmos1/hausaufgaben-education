package hu.eteo.ks.service;

import hu.eteo.ks.model.dto.StudentDto;
import io.swagger.model.Student;

import java.util.Collection;

public interface StudentService {


    StudentDto getStudentById(Integer id);

    Collection<Student> getAllStudent();

    void delete(Integer id);
}
