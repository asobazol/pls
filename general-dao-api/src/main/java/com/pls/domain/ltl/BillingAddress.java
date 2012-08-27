package com.pls.domain.ltl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pls.domain.Identifiable;

@Entity
@Table(name = "customer")
public class BillingAddress implements Identifiable<Integer> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public BillingAddress() {
	}

	public Integer getId() {
		return id;
	}
}
