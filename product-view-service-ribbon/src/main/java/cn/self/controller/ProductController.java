package cn.self.controller;


import cn.self.pojo.Product;
import cn.self.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model model){
        List<Product> listProduct = productService.listProduct();
        model.addAttribute("ps",listProduct);
        return "products";
    }
}
