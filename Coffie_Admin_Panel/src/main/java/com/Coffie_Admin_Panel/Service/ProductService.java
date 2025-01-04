package com.Coffie_Admin_Panel.Service;

import java.util.List;

import com.Coffie_Admin_Panel.Dto.Message;
import com.Coffie_Admin_Panel.Dto.ProductDto;

public interface ProductService {
Message<ProductDto>addProduct(ProductDto dto);
Message<ProductDto>updateProduct(ProductDto dto);
Message<ProductDto>deleteProduct(int id);
List<Message<ProductDto>>getAllProducts();
Message<ProductDto>getProductById(int id);
Message<ProductDto>searchProduct(String name);
}
