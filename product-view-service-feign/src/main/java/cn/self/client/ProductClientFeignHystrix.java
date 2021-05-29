package cn.self.client;

import cn.self.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign{
    @Override
    public List<Product> listProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(0,"产品数据微服务暂不可用",0));
        return productList;
    }
}
