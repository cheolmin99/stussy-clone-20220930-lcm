package com.stussy.stussyclone20220930cheolmin.dto.admin;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class ProductRegisterReqDto {
    private String category;
    private String name;
    @Min(value =  100, message = "최소 가격은 최소 100원입니다.")
    private int price;
    private String simpleInfo;
    private String detailInfo;
    private String optionInfo;
    private String managementInfo;
    private String shippingInfo;
}