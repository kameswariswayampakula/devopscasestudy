package com.example.devopscasestudy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.devopscasestudy.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product ,Integer> {
	List<Product> findByPriceGreaterThan(double price);
	List<Product> deleteById(int productId);
	List<Product> findById(int productId);
	List<Product> findByProductNameIgnoreCase(String productName);
}
