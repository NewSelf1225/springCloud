package cn.self.client;


import cn.self.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author ck
 */
@FeignClient(value = "PRODUCT-DATA-SERVICES",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
    /**
     * @return products
     */
    @GetMapping("/products")
    public List<Product> listProducts();
}
