package com.Coffie_Admin_Panel.Mapper;

import com.Coffie_Admin_Panel.Dto.ProductDto;
import com.Coffie_Admin_Panel.Model.Product;

public interface ProductMapper {
 public Product EntityToDto(ProductDto dto);
 public ProductDto DtoToEntity(Product product);
}
