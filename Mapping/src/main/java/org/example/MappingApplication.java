package org.example;

import org.example.entity.Course;
import org.example.entity.Department;
import org.example.entity.Employee;
import org.example.entity.Student;
import org.example.repository.CourseRepo;
import org.example.repository.DepartmentRepository;
import org.example.repository.EmployeeRepository;
import org.example.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MappingApplication.class, args);


//        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
//        DepartmentRepository d2 = context.getBean(DepartmentRepository.class);
//        Employee e= new Employee();
//        Employee e1= new Employee();
//        Employee e2= new Employee();
//        e.setE_name("A");
//        e1.setE_name("B");
//        e2.setE_name("C");
//        employeeRepository.save(e);
//        employeeRepository.save(e1);
//        employeeRepository.save(e2);
//
//        Department d = new Department();
//        List<Employee> allemp = new ArrayList<>();
//        allemp.add(e);
//        allemp.add(e1);
//        allemp.add(e2);
//
//        d.setD_id(100);
//        d.setD_name("MCA");
//        d.setListEmp(allemp);
//
//        System.out.println(e);
//        System.out.println(d);

        StudentRepo sr=ioc.getBean(StudentRepo.class);
        CourseRepo cr=ioc.getBean(CourseRepo.class);

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        Course c1=new Course();
        Course c2=new Course();
        Course c3=new Course();

        c1.setC_id(100);
        c1.setC_name("CXDP");
        c2.setC_id(200);
        c2.setC_name("java");
        c3.setC_id(300);
        c3.setC_name("daa");

    }

}
