package com.Coffie_Admin_Panel.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Coffie_Admin_Panel.Dto.Message;
import com.Coffie_Admin_Panel.Dto.ProductDto;
import com.Coffie_Admin_Panel.Mapper.ProductMapper;
import com.Coffie_Admin_Panel.Repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	public final ProductMapper mapper;
	public final ProductRepository repository;

	@Override
	public Message<ProductDto> addProduct(ProductDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message<ProductDto> updateProduct(ProductDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message<ProductDto> deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message<ProductDto>> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message<ProductDto> getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message<ProductDto> searchProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
