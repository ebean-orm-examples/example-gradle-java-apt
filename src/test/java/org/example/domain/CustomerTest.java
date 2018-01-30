package org.example.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void iud() {

		Customer customer = new Customer("Rob");
		customer.save();

	}
}