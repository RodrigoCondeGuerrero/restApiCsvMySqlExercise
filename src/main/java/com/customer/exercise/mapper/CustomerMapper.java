package com.customer.exercise.mapper;

import com.customer.exercise.dto.CustomerDto;
import com.customer.exercise.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper
{
    CustomerDto mapDto(Customer customer);

    Customer mapEntity(CustomerDto customer);
}
