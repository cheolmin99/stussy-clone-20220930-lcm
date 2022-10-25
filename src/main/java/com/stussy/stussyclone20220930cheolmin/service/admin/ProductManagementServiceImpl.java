package com.stussy.stussyclone20220930cheolmin.service.admin;

import com.stussy.stussyclone20220930cheolmin.dto.admin.CategoryResponseDto;
import com.stussy.stussyclone20220930cheolmin.dto.admin.ProductMstOptionRespDto;
import com.stussy.stussyclone20220930cheolmin.dto.admin.ProductRegisterReqDto;
import com.stussy.stussyclone20220930cheolmin.exception.CustomInternalServerErrorException;
import com.stussy.stussyclone20220930cheolmin.repository.admin.ProductManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManagementServiceImpl implements ProductManagementService {

    private final ProductManagementRepository productManagementRepository;

    @Override
    public List<CategoryResponseDto> getCategoryList() throws Exception {
        List<CategoryResponseDto> categoryResponseDto = new ArrayList<CategoryResponseDto>();
        productManagementRepository.getCategoryList().forEach(category -> {
            categoryResponseDto.add(category.toDto());
        });
        return categoryResponseDto;
    }

    @Override
    public void registerMst(ProductRegisterReqDto productRegisterReqDto) throws Exception {
        if (productManagementRepository.saveProductMst(productRegisterReqDto.toEntity()) == 0) { //insert 안 되면
            throw new CustomInternalServerErrorException("상품 등록 실패"); //이 에러를 띄워라.
        }

    }

    @Override
    public List<ProductMstOptionRespDto> getProductMstList() throws Exception {
        List<ProductMstOptionRespDto> list = new ArrayList<ProductMstOptionRespDto>();

        productManagementRepository.getProductMstList().forEach(pdtMst -> {
            list.add(pdtMst.toDto());
        });
        return list;
    }

}
