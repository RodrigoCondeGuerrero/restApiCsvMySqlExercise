package com.customer.exercise.service;

import com.customer.exercise.dto.CustomerDto;
import com.customer.exercise.exception.ObjectNotFoundException;

public interface CustomerService
{
    CustomerDto getCustomer(int customerRef) throws ObjectNotFoundException;

    CustomerDto saveCustomer(CustomerDto customer);

    void loadCustomersFromFile(String filePath);
}
