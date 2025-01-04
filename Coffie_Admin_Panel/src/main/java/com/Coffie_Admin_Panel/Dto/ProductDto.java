package com.Coffie_Admin_Panel.Dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
public class ProductDto {
	private int id;
	private String name;
	private String description;
	private int beans;
	private int frenchPress;
	private int pourOver;
	private int espresso;
	private int turkish;
	private int weight_250g;
	private int weight_500g;
	private int weight_1kg;
	private int price;
	private String image;
}
