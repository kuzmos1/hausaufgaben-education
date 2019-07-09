package hu.eteo.ks.repository;

import hu.eteo.ks.model.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {
}
