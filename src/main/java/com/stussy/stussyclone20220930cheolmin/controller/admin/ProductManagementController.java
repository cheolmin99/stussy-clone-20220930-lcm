package com.stussy.stussyclone20220930cheolmin.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProductManagementController {

    @GetMapping("/product/register")
    public String loadProductRegister() {
        return "admin/regist_ration";
    }
}