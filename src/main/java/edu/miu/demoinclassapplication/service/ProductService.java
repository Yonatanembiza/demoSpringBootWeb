package edu.miu.demoinclassapplication.service;

import edu.miu.demoinclassapplication.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
}
