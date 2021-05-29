package cn.self.controller;

import cn.self.pojo.Product;
import cn.self.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ck
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(){
        List<Product> productList = productService.listProduct();
        return productList;
    }
}
