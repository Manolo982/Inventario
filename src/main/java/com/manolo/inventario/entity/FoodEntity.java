package com.manolo.inventario.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FoodEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private String description;
    private String input;
    private String expired;
    private String price;
	
    public FoodEntity() {
    	
    }
    
    public int getId() {
        return id;
    }
    
    public String getCode() {
    	return code;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public String getExpired() {
    	return expired;
    }

    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String desc) {
    	this.description=desc;
    }

    public void setCode(String code) {
    	this.code=code;
    }
    
    public void setExpired(String expired) {
    	this.expired=expired;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodEntity [id=" + id + ", name=" + name + ", code=" + code + ", description=" + description
                + ", expired=" + expired + ", price=" + price + "]";
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodEntity other = (FoodEntity) obj;
		return Objects.equals(code, other.code) && Objects.equals(expired, other.expired) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, expired, id, name, price);
	}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }

}
