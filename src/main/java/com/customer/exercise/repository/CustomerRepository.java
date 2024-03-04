package com.customer.exercise.repository;

import com.customer.exercise.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
}
