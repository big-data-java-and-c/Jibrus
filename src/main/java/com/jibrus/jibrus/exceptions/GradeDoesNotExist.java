package com.jibrus.jibrus.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GradeDoesNotExist extends RuntimeException  {

    public GradeDoesNotExist(String message) {
        super(message);
    }
}
