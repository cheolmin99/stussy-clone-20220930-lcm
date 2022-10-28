package com.stussy.stussyclone20220930cheolmin.service;

import com.stussy.stussyclone20220930cheolmin.dto.CollectionListRespDto;
import com.stussy.stussyclone20220930cheolmin.dto.ProductRespDto;

import java.util.List;

public interface ProductService {
    public List<CollectionListRespDto> getProductList(String category, int page) throws Exception;

    public ProductRespDto getProduct(int pdtId) throws Exception;
}
