package cl.duoc.ms_products_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.ms_products_bff.config.ProductBsFeignClient;
import cl.duoc.ms_products_bff.model.dto.Product;

@Service
public class ProductService {


    @Autowired
    ProductBsFeignClient bsFeignClient;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return bsFeignClient.getProducts();
    }

}
