package hu.eteo.ks.app.controller.config;

import hu.eteo.ks.model.dto.StudentDto;
import io.swagger.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class ConfigImpl implements Config {

    private static final HashMap<Long, Student> hm = new HashMap<>();
    public final static Logger logger = LoggerFactory.getLogger(ConfigImpl.class);

    @Override
    public void clear() {

    }

    @Override
    public void init() {

    }

    @Override
    public StudentDto getStudentById(Integer id) {
        return null;
    }

    @Override
    public Collection<Student> getAllStudent() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
