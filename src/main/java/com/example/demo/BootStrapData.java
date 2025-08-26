package com.example.demo;

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

        if (customerRepository.count() == 1) {
            Customer john = new Customer();
            john.setFirstName("John");
            john.setLastName("Carpenter");
            john.setAddress("222 Horror Ave");
            john.setPhone("1111111");
            john.setPostal_code("11111");
            john.setDivision_id(divisionRepository.getReferenceById(2));

            customerRepository.save(john);

            Customer bela = new Customer();
            bela.setFirstName("Bela");
            bela.setLastName("Lugosi");
            bela.setAddress("222 Vampire Way");
            bela.setPhone("2222222");
            bela.setPostal_code("22222");
            bela.setDivision_id(divisionRepository.getReferenceById(3));

            customerRepository.save(bela);

            Customer spongebob = new Customer();
            spongebob.setFirstName("Spongebob");
            spongebob.setLastName("Squarepants");
            spongebob.setAddress("333 Bikini Bottom rd");
            spongebob.setPhone("3333333");
            spongebob.setPostal_code("33333");
            spongebob.setDivision_id(divisionRepository.getReferenceById(4));

            customerRepository.save(spongebob);

            Customer harry = new Customer();
            harry.setFirstName("Harry");
            harry.setLastName("Potter");
            harry.setAddress("444 Little Whinging");
            harry.setPhone("4444444");
            harry.setPostal_code("44444");
            harry.setDivision_id(divisionRepository.getReferenceById(5));

            customerRepository.save(harry);

            Customer barry = new Customer();
            barry.setFirstName("Barry");
            barry.setLastName("Allen");
            barry.setAddress("555 Flash rd");
            barry.setPhone("5555555");
            barry.setPostal_code("55555");
            barry.setDivision_id(divisionRepository.getReferenceById(6));

            customerRepository.save(barry);
        }
    }
}
