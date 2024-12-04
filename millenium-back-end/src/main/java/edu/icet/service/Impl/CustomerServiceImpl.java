package edu.icet.service.Impl;

import edu.icet.Entity.CustomerEntity;
import edu.icet.Model.Customer;
import edu.icet.dao.CustomerDao;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;
    private final ModelMapper mapper;

    @Override
    public void addCustomer(Customer customer) {
        customerDao.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomerByID(Long customerID) {
        customerDao.deleteById(customerID);
    }

    @Override
    public Customer searchCustomerByID(Long customerID) {
        return mapper.map(customerDao.findById(customerID),Customer.class);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.save(mapper.map(customer,CustomerEntity.class));
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customerArrayList = new ArrayList<>();
        customerDao.findAll().forEach(customerEntity -> {
            customerArrayList.add(mapper.map(customerEntity, Customer.class));
        });
        return customerArrayList;
    }
}
