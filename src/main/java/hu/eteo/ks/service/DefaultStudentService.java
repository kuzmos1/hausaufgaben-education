package hu.eteo.ks.service;

import hu.eteo.ks.model.dto.StudentDto;
import hu.eteo.ks.model.entity.StudentEntity;
import hu.eteo.ks.model.mapper.StudentMapper;
import hu.eteo.ks.repository.StudentRepository;
import hu.eteo.ks.service.exception.StudentNotFoundExeptions;
import io.swagger.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

@Service
public class DefaultStudentService {

    private static final HashMap<Integer, Student> studentMap = new HashMap<>();
    public final static Logger logger = LoggerFactory.getLogger(DefaultStudentService.class);

    private final StudentRepository studentRepository;

    @Autowired
    public DefaultStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // @Override
    public StudentDto getStudentById(Integer id) {
        final Optional<StudentEntity> studentEntityOptional = studentRepository.findById(id);
        if (!studentEntityOptional.isPresent()) {
            throw new StudentNotFoundExeptions("not found student id");
        }
        logger.info(" getStudentById method is ok");
        return StudentMapper.toStudent(studentEntityOptional.get());
    }

 //   @Override
    public Collection<StudentDto> getAllStudent() {

        final Iterable<StudentEntity> iterable = studentRepository.findAll();

      /*  if(customerMap.isEmpty())
            throw new EntityIsNotExistException("All customer not found");*/

        for (StudentEntity studentEntity : iterable) {
            logger.debug(studentEntity.toString());
        }
        logger.info("getAllStudent is ok");
        return StudentMapper.toStudentCollection(iterable);
    }

 //  @Override
    public void delete(Integer id){
        if(!studentRepository.existsById(id))
            throw new StudentNotFoundExeptions(" No customer found by the ID: " + id.toString());
        studentRepository.deleteById(id);
        logger.info("StudentEntrity is deleted");
    }

}