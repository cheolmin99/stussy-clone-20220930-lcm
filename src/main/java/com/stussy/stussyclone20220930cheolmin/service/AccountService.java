package com.stussy.stussyclone20220930cheolmin.service;

import com.stussy.stussyclone20220930cheolmin.domain.User;
import com.stussy.stussyclone20220930cheolmin.dto.RegisterReqDto;
import com.stussy.stussyclone20220930cheolmin.exception.CustomValidationException;
import com.stussy.stussyclone20220930cheolmin.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



public interface AccountService {

    public void duplicateEmail(RegisterReqDto registerReqDto) throws Exception;
    public void register(RegisterReqDto registerReqDto) throws Exception;



}
