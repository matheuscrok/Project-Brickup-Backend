package com.crok.projectbrickupbackend.config;

import com.crok.projectbrickupbackend.entity.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandlingController extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleError(HttpServletRequest req, Exception e) {
        Error erro = new Error();

        if(e instanceof ConstraintViolationException) {
            ConstraintViolationException cve = (ConstraintViolationException) e;
            StringBuffer msg = new StringBuffer();
            for(ConstraintViolation cv : cve.getConstraintViolations()) {
                msg.append(cv.getMessage());
                msg.append(";");
            }
            erro.setMensagem(msg.toString());
        }

        return new ResponseEntity<Error>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
