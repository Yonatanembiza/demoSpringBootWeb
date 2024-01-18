package edu.miu.demoinclassapplication.service;

import edu.miu.demoinclassapplication.entity.Product;
import edu.miu.demoinclassapplication.entity.dto.response.ProductDto;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    ProductDto findById(int id);
}
