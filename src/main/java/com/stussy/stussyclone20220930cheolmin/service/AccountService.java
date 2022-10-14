package com.stussy.stussyclone20220930cheolmin.service;

import com.stussy.stussyclone20220930cheolmin.dto.RegisterReqDto;


public interface AccountService {

    public void duplicateEmail(RegisterReqDto registerReqDto) throws Exception;
    public void register(RegisterReqDto registerReqDto) throws Exception;



}
