package org.example.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("1")
    int id;
    @Value("Amlan")
    String name;
    @Autowired
    Department D1;

    public Employee() {
    }

    public Employee(int id, String name, Department d1) {
        this.id = id;
        this.name = name;
        D1 = d1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getD1() {
        return D1;
    }

    public void setD1(Department d1) {
        D1 = d1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", D1=" + D1 +
                '}';
    }
}
