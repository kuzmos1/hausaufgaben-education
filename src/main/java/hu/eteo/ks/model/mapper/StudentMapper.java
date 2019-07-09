package hu.eteo.ks.model.mapper;

import hu.eteo.ks.model.dto.SchoolDto;
import hu.eteo.ks.model.dto.StudentDto;
import hu.eteo.ks.model.entity.StudentEntity;
import io.swagger.model.School;
import io.swagger.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentMapper {

    public static StudentDto toStudent (StudentEntity studentEntity){
        return new StudentDto(studentEntity.getFirstName(),studentEntity.getLastName(),studentEntity.getAge(),studentEntity.getAddress());
    }

    public static StudentEntity toStudentEntity (StudentDto student){
        return new StudentEntity(student.getFirstName(),student.getLastName(),student.getAge(),student.getAddress());
    }

    public static Collection<StudentDto> toStudentCollection(Iterable<StudentEntity> sourceIterable){
        final Collection<StudentDto> resultCollection = new ArrayList<>();
        for(StudentEntity studentEntity : sourceIterable){
            final StudentDto student = toStudent(studentEntity);
            resultCollection.add(student);
        }
        return resultCollection;
    }

/*    public static StudentEntity toStudentEntity(List<School> schoollist) {

        final Collection<Student> resultCollection = new ArrayList<>();
        for(School schoolEntity : schoollist){
            final Student student = toStudent(schoolEntity);
            resultCollection.add(student);
        }
        return resultCollection;

    }*/

}
