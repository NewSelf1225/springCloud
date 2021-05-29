package cn.self.service;

import cn.self.client.ProductClientFeign;
import cn.self.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }

}
