package cn.self.service;

import cn.self.client.ProductClientRibbon;
import cn.self.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ck
 */
@Service
public class ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProduct(){
        return productClientRibbon.listProduct();
    }
}
