package com.stussy.stussyclone20220930cheolmin.service.admin;

import com.stussy.stussyclone20220930cheolmin.dto.admin.CategoryResponseDto;
import com.stussy.stussyclone20220930cheolmin.dto.admin.ProductRegisterReqDto;
import com.stussy.stussyclone20220930cheolmin.service.repository.admin.ProductManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManagementServiceImpl implements ProductManagementService {

    private final ProductManagementRepository productManagementRepository;

    @Override
    public List<CategoryResponseDto> getCategoryList() throws Exception {
        /*
        여기서 시작
         */

        return null;
    }

    @Override
    public void registerMst(ProductRegisterReqDto productRegisterReqDto) throws Exception{

    }

}
