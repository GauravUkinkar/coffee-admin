package com.Coffie_Admin_Panel.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@Accessors(chain = true)
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
