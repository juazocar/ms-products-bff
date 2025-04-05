package cl.duoc.ms_products_bff.config;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ms_products_bff.model.dto.Product;

@FeignClient(name = "ms-products-bs", url = "http://localhost:8081")
public interface ProductBsFeignClient {

    @GetMapping("/product/products")
    public List<Product> getProducts();

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product);
}
