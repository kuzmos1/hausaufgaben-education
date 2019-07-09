package hu.eteo.ks.controller;

import hu.eteo.ks.model.dto.StudentDto;
import hu.eteo.ks.service.StudentService;
import io.swagger.api.StudentApi;
import io.swagger.model.School;
import io.swagger.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public class StudentController implements StudentApi {

    public final static Logger logger = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    public StudentService studentService;

    @Override
    public ResponseEntity<Void> addStudent(@Valid Student body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteStudent(Integer studentId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<Void> getAllStudent(@Valid Student body) {
        logger.info("Run ok!");
        return (ResponseEntity<Void>) studentService.getAllStudent();
    }

    @Override
    public ResponseEntity<School> getSchoolById(Integer schoolId) {
        return null;
    }

    @Override
    public ResponseEntity<Student> getStudentById(Integer studentId) {
      /*  final StudentDto result = studentService.getStudentById(studentId);
        logger.info("Metódus ok");
        return ResponseEntity.ok(result);*/
      return null;
    }

    @Override
    public ResponseEntity<Void> updateOneStudent(Integer studentId, @Valid Student body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateStudent(@Valid Student body) {
        return null;
    }
}
