package edu.miu.demoinclassapplication.service.Impl;

import edu.miu.demoinclassapplication.entity.Product;
import edu.miu.demoinclassapplication.entity.dto.response.ProductDto;
import edu.miu.demoinclassapplication.repo.ProductRepo;
import edu.miu.demoinclassapplication.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductDto findById(int id) {
        return modelMapper.map(productRepo.getById(id), ProductDto.class);
    }
}
