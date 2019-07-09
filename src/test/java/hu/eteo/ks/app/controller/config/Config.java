package hu.eteo.ks.app.controller.config;

import hu.eteo.ks.service.StudentService;

public interface Config extends StudentService {

    public void clear();
    public void init();
}
