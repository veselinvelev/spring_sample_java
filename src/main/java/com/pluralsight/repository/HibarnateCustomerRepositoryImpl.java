package com.pluralsight.repository;


import com.pluralsight.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class HibarnateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Veselin");
        customer.setLastname("Velev");
        Iterator<Customer> iterator = customers.iterator();


        customers.add(customer);

        return customers;
    }

}
