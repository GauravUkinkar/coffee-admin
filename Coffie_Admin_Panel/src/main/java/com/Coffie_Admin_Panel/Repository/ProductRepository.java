package com.Coffie_Admin_Panel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Coffie_Admin_Panel.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
