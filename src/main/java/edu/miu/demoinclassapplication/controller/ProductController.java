package edu.miu.demoinclassapplication.controller;

import edu.miu.demoinclassapplication.entity.Product;
import edu.miu.demoinclassapplication.entity.dto.response.ProductDto;
import edu.miu.demoinclassapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable("id") int id){
        return productService.findById(id);
    }
}
