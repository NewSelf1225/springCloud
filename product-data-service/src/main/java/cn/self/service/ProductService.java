package cn.self.service;

import cn.self.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ck
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProduct(){
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product A from :" + port,50));
        ps.add(new Product(2,"product B from :" + port,100));
        ps.add(new Product(3,"product C from :" + port,150));
        return ps;
    }

}
