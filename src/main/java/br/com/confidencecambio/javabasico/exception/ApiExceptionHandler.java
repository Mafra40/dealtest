package br.com.confidencecambio.javabasico.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.*;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ConstraintViolationException.class)
    protected ResponseEntity<Object> constraintViolationException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
        Map<String, List<String>> errors = new HashMap<>();
        ArrayList<String> errosMsg = new ArrayList<>();

        for (ConstraintViolation constraintViolation : constraintViolations) {
            errosMsg.add(constraintViolation.getMessage());
            errors.put(constraintViolation.getPropertyPath().toString() , errosMsg) ;
        }

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}