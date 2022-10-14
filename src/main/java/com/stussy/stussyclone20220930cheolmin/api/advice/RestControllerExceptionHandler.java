package com.stussy.stussyclone20220930cheolmin.api.advice;

import com.stussy.stussyclone20220930cheolmin.dto.CMRespDto;
import com.stussy.stussyclone20220930cheolmin.exception.CustomInternalServerErrorException;
import com.stussy.stussyclone20220930cheolmin.exception.CustomValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RestControllerAdvice

public class RestControllerExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public ResponseEntity<?> validationErrorException(CustomValidationException e) {

        return ResponseEntity.badRequest().body(new CMRespDto<>(e.getMessage(),e.getErrorMap()));
    }
    @ExceptionHandler(CustomInternalServerErrorException.class) //이 예외 발생 시 메소드 실행
    public ResponseEntity<?> internalServerErrorException(CustomInternalServerErrorException e) {

        return ResponseEntity.internalServerError().body(new CMRespDto<>(e.getMessage(), null));
        //internalServerError = 500에러
    }


}
