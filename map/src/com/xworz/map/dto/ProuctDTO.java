package com.xworz.map.dto;

import java.time.LocalDate;
import java.util.Objects;

public class ProuctDTO implements Comparable<ProuctDTO>{

	private String name;
	private Double price;
	private Integer id;
	private Integer quantity;
	private LocalDate manfDate;

	public ProuctDTO(String name, Double price, Integer id, Integer quantity, LocalDate manfDate) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.quantity = quantity;
		this.manfDate = manfDate;
	}

	@Override
	public String toString() {
		return "ProuctDTO [name=" + name + ", price=" + price + ", id=" + id + ", quantity=" + quantity + ", manfDate="
				+ manfDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, manfDate, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProuctDTO other = (ProuctDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(manfDate, other.manfDate)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

	@Override
	public int compareTo(ProuctDTO o) {
		return id.compareTo(quantity);
	}

}
