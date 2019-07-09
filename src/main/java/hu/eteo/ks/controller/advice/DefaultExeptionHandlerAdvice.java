package hu.eteo.ks.controller.advice;


import hu.eteo.ks.service.exception.StudentNotFoundExeptions;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DefaultExeptionHandlerAdvice extends ResponseEntityExceptionHandler {

    private static final String ENTITY_NOT_FOUND = "Entity not found";

   public ResponseEntity<Object> StudentNotFoundExeption(StudentNotFoundExeptions ex, WebRequest request){
       return handleExceptionInternal(ex, ENTITY_NOT_FOUND, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
   }
}
