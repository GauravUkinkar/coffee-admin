package com.Coffie_Admin_Panel.Mapper;

import org.springframework.stereotype.Component;

import com.Coffie_Admin_Panel.Dto.ProductDto;
import com.Coffie_Admin_Panel.Model.Product;

@Component
public class ProductMapperImpl implements ProductMapper {

	@Override
	public Product EntityToDto(ProductDto dto) {
		return new Product()
				.setBeans(dto.getBeans())
				.setDescription(dto.getDescription())
				.setFrenchPress(dto.getFrenchPress())
				.setId(dto.getId())
				.setName(dto.getName())
				.setPourOver(dto.getPourOver())
				.setPrice(dto.getPrice())
				.setTurkish(dto.getTurkish())
				.setWeight_1kg(dto.getWeight_1kg())
				.setWeight_250g(dto.getWeight_250g())
				.setWeight_500g(dto.getWeight_500g())
				.setEspresso(dto.getEspresso());
	}

	@Override
	public ProductDto DtoToEntity(Product product) {
		return new ProductDto()
				.setBeans(product.getBeans())
				.setDescription(product.getDescription())
				.setFrenchPress(product.getFrenchPress())
				.setId(product.getId())
				.setName(product.getName())
				.setPourOver(product.getPourOver())
				.setPrice(product.getPrice())
				.setTurkish(product.getTurkish())
				.setWeight_1kg(product.getWeight_1kg())
				.setWeight_250g(product.getWeight_250g())
				.setWeight_500g(product.getWeight_500g())
				.setEspresso(product.getEspresso());
	}

}
