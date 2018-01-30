package org.example.domain;

import org.example.domain.query.QCustomer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void iud() {

		Customer customer = new Customer("Rob");
		customer.save();

		assertNotNull(customer.getId());
	}

	@Test
	public void queryBean() {

		new QCustomer()
				.name.startsWith("Frank")
				.findList();
	}
}