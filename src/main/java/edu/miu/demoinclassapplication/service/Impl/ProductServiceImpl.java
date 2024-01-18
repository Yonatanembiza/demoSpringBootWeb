package edu.miu.demoinclassapplication.service.Impl;

import edu.miu.demoinclassapplication.entity.Product;
import edu.miu.demoinclassapplication.repo.ProductRepo;
import edu.miu.demoinclassapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.getById(id);
    }
}
