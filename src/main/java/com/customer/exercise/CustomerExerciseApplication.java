package com.customer.exercise;

import com.customer.exercise.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerExerciseApplication implements CommandLineRunner
{
    @Autowired
    private ApplicationContext applicationContext;


    public static void main(String[] args)
    {
        SpringApplication.run(CustomerExerciseApplication.class, args);
    }

    @Override
    public void run(String... args)
    {
        if (args.length > 0 && !args[0].isEmpty())
        {
            CustomerService service = applicationContext.getBean(CustomerService.class);
            service.loadCustomersFromFile(args[0]);
        }
    }

    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
