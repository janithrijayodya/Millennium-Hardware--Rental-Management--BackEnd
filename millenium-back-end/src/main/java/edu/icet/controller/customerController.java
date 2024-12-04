package edu.icet.controller;

import edu.icet.Model.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class customerController {

    @Autowired
    final CustomerService service;

    @PostMapping("add_customer")
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
        try{
            service.addCustomer(customer);
            return ResponseEntity.ok("Customer added succesfully");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/search_customer/{customerID}")
    public Customer searchCustomer(@PathVariable Long customerID){
        return service.searchCustomerByID(customerID);
    }


    @PutMapping("/update_customer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
        try{
            service.updateCustomer(customer);
            return ResponseEntity.ok("Updated");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @DeleteMapping("/delete_by_id/{customerID}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long customerID){
        try{
            service.deleteCustomerByID(customerID);
            return ResponseEntity.ok("Deleted");
        } catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/get_all")
    public List<Customer> getAll(){
        return service.getAllCustomers();
    }
}
