package com.manolo.inventario.entity;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyFoods")
public class MyListFoodEntity {

	@Id
    private int id;
    private String name;
    private String code;
	private String input;
    private String expired;
    private String price;

    public MyListFoodEntity() {
		
    }
    
    public MyListFoodEntity(int id, String name, String code, String input, String expired, String price) {
        this.id = id;
        this.name = name;
        this.code=code;
        this.expired=expired;
		this.input = input;
        this.price = price;
    }

	public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
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
		return "MyListBookEntity [id=" + id + ", name=" + name + ", code=" + code + ", expired=" + expired + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, expired, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyListFoodEntity other = (MyListFoodEntity) obj;
		return Objects.equals(code, other.code) && Objects.equals(expired, other.expired) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

    
}
