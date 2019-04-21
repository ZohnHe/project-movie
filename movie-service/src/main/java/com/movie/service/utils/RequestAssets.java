package com.movie.service.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.List;

public class RequestAssets {
    public static void assetsError(BindingResult errors){
        if (errors.hasErrors()) {
            List<ObjectError> errorList = errors.getAllErrors();
            StringBuilder sb = new StringBuilder();
            for (ObjectError error : errorList) {
                FieldError fieldError = (FieldError) error;
                sb.append(fieldError.getDefaultMessage() + "   ");
            }
            throw new RuntimeException(sb.toString());
        }
    }
}
