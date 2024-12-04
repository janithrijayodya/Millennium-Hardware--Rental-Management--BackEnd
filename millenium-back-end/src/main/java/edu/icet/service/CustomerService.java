package edu.icet.service;

import edu.icet.Model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomerByID(Long customerID);
    Customer searchCustomerByID(Long customerID);
    void updateCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
