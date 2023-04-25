package com.daniel.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.daniel.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {
  List<Product> findAll();

  
}
