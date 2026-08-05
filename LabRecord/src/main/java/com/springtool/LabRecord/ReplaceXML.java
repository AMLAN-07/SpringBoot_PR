package com.springtool.LabRecord;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springtool.LabRecord")
public class ReplaceXML {

    @Bean(name = {"e1"})
    public Employee EmpData() {


        return new Employee(1,"AMlan",AddressData());
    }

    @Bean
    public Address AddressData() {
        return new Address("Odisha","Angul",759125);

    }

}
