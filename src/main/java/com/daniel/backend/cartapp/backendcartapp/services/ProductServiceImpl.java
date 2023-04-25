package com.daniel.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daniel.backend.cartapp.backendcartapp.models.entities.Product;
import com.daniel.backend.cartapp.backendcartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private final ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }  

  @Override
  @Transactional(readOnly = true)//Sincronizacion de JPA y base de datos y readonly por que solo es para una consulta
  public List<Product> findAll() {
    return (List<Product>) productRepository.findAll();
  }
  
}
