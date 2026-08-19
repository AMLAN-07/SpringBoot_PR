package com.org.Employee;

import com.org.Employee.entity.Employee;
import com.org.Employee.entity.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {

		ApplicationContext ioc = SpringApplication.run(EmployeeApplication.class, args);
		EmployeeRepo es = (EmployeeRepo) ioc.getBean("employeeRepo");

//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setName("Aman");
//		es.save(emp);
		Iterable<Employee> allEmployees = es.findAll();
		allEmployees.forEach(employee ->  System.out.println(employee));

		Optional<Employee> oneData=es.findById(1);
		Employee employee=oneData.get();
		System.out.println(employee +"done run");
	}
}
