package com.infytel.InfytelSwaggerDocumentation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infytel.InfytelSwaggerDocumentation.dto.CustomerDTO;
import com.infytel.InfytelSwaggerDocumentation.exceptions.NoSuchCustomerException;
import com.infytel.InfytelSwaggerDocumentation.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	// Contacts repository layer to add customer
	public String createCustomer(CustomerDTO customerDTO) {
		return customerRepository.createCustomer(customerDTO);
	}
	// Contacts repository layer to fetch customer
	public List<CustomerDTO> fetchCustomer() {
		return customerRepository.fetchCustomer();
	}
	// Contacts repository layer to delete customer
	public String deleteCustomer(long phoneNumber) throws NoSuchCustomerException {
		return customerRepository.deleteCustomer(phoneNumber);
	}
	// Contacts repository layer to update customer
	public String updateCustomer(long phoneNumber, CustomerDTO customerDTO) {
		return customerRepository.updateCustomer(phoneNumber, customerDTO);
	}
}
