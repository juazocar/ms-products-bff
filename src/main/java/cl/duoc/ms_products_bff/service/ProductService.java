package cl.duoc.ms_products_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.ms_products_bff.config.ProductBsFeignClient;
import cl.duoc.ms_products_bff.model.dto.Product;

@Service
public class ProductService {


    @Autowired
    ProductBsFeignClient bsFeignClient;

    public List<Product> getProducts() {
        List<Product> listaProductos = bsFeignClient.getProducts();
        return listaProductos;
    }

}
