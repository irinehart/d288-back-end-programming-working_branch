package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {

        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setFirstName("Peter");
        customer1.setLastName("Parker");
        customer1.setPostal_code("10001");
        customer1.setAddress("20 Ingram St");
        customer1.setPhone("(555) 123-4567");
        customer1.setDivision(divisionRepository.findAll().get(8));

        Customer customer2 = new Customer();
        customer2.setFirstName("Diana");
        customer2.setLastName("Prince");
        customer2.setPostal_code("20001");
        customer2.setAddress("45 Themyscira Blvd");
        customer2.setPhone("(555) 234-5678");
        customer2.setDivision(divisionRepository.findAll().get(7));

        Customer customer3 = new Customer();
        customer3.setFirstName("Bruce");
        customer3.setLastName("Wayne");
        customer3.setPostal_code("30001");
        customer3.setAddress("8 Wayne Manor");
        customer3.setPhone("(555) 345-6789");
        customer3.setDivision(divisionRepository.findAll().get(5));

        Customer customer4 = new Customer();
        customer4.setFirstName("Tony");
        customer4.setLastName("Stark");
        customer4.setPostal_code("12345");
        customer4.setPhone("(555) 567-8901");
        customer4.setAddress("1 Stark Tower");
        customer4.setDivision(divisionRepository.findAll().get(2));

        Customer customer5 = new Customer();
        customer5.setFirstName("Natasha");
        customer5.setLastName("Romanoff");
        customer5.setPostal_code("40001");
        customer5.setAddress("10 Red Room Ave");
        customer5.setPhone("(555) 456-7890");
        customer5.setDivision(divisionRepository.findAll().get(3));

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);

        customerRepository.findAll();

    }

}
