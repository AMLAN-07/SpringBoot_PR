package org.example;

import org.example.entity.Department;
import org.example.entity.Department2;
import org.example.entity.Employee;
import org.example.repository.Department2Repository;
import org.example.repository.DepartmentRepository;
import org.example.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MappingApplication.class, args);


        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        Department2Repository d2 = context.getBean(Department2Repository.class);
        Employee e= new Employee();
        Employee e1= new Employee();
        Employee e2= new Employee();
        e.setE_name("Hira");
        e1.setE_name("Hira2");
        e2.setE_name("Hira3");
        employeeRepository.save(e);
        employeeRepository.save(e1);
        employeeRepository.save(e2);

        Department2 d = new Department2();
        List<Employee> allemp = new ArrayList<>();
        allemp.add(e);
        allemp.add(e1);
        allemp.add(e2);

        d.setD_name("MCA");
        d.setE(allemp);

        System.out.println(e);
        System.out.println(d);
    }

}
