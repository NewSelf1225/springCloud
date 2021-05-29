package cn.self.client;


import cn.self.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ck
 */
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

   public List<Product> listProduct(){
       return restTemplate.getForObject("http://PRODUCT-DATA-SERVICES/products",List.class);
   }
}
