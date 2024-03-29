package net.javaguides.springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name="customer")
@Table(name= "customer")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="email")
    private String email;
	
	@Column(name="address")
    private String address;
 
    protected Customer() {
    }
 
    protected Customer(String name, String email, String address) {
    	this.name = name;
        this.email = email;
        this.address = address;
    }
}
